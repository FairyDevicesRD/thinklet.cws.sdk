package ai.fd.thinklet.app.cwssdksample

import ai.fd.thinklet.app.cwssdk.CwsSdk
import ai.fd.thinklet.app.cwssdk.`interface`.cws.extension.getCwsRequestInfo
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import java.time.Instant
import java.time.format.DateTimeFormatterBuilder

/**
 * CWS APIの「デバイスでコマンドを実行させる」API で呼び出すクラス。
 *
 * @param callback 呼び出し元へ結果を戻すためのinterface
 */
class CommandReceiver(private val callback: CommandReceiverCallback) : BroadcastReceiver() {
    companion object {
        const val TAG = "CommandReceiver"
        const val INTENT_ACTION = "ai.fd.thinklet.app.cwssdksample.CommandReceiver.notify"
        const val INTENT_EXTRAS_KEY_ID = "id"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        if (null == context) {
            Log.w(TAG, "BroadcastReceiver.onReceive context is null")
            return
        }
        if (null == intent) {
            Log.w(TAG, "BroadcastReceiver.onReceive intent is null")
            return
        }

        /**
         * 「デバイスでコマンドを実行させる」APIのbodyに以下を指定して呼び出す
         * {
         *   "package": "ai.fd.thinklet.app.cwssdksample",
         *   "classpath": "ai.fd.thinklet.app.cwssdksample.CommandReceiver",
         *   "action": "ai.fd.thinklet.app.cwssdksample.CommandReceiver.notify",
         *   "launchType": "broadcast",
         *   "extras": {
         *     "id": "12345-abcde"
         *   }
         * }
         *
         *  すると、以下のようにintentのextraから"id"のkey名で値を取得できる
         */
        val id = intent.getStringExtra(INTENT_EXTRAS_KEY_ID)
        Log.d(TAG, "BroadcastReceiver.onReceive intent extra[id]: $id")

        val cws = CwsSdk(context = context)
        val replyCommandResultFuture = cws.replyCommandResult(
            customData = "send command result.",
            cwsRequestInfo = intent.getCwsRequestInfo(),
            success = true,
        )
        replyCommandResultFuture.whenComplete { _, throwable ->
            var message = "success"
            throwable?.message?.also { throwableMessage ->
                message = throwableMessage
            }
            Log.d(TAG, "replyCommandResult result message: $message")
            callback.onSentCommandResult(message)
        }
    }

    /**
     * 呼び出し元へ結果を戻すためのinterface
     */
    interface CommandReceiverCallback {
        fun onSentCommandResult(invokeResult: String)
    }
}
