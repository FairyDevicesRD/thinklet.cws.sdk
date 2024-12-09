//[cwsSdk_v2.0.0](../../../index.md)/[ai.fd.thinklet.app.cwssdk](../index.md)/[CwsSdk](index.md)/[sendErrorMessage](send-error-message.md)

# sendErrorMessage

[androidJvm]\
fun [sendErrorMessage](send-error-message.md)(customData: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [CompletableFuture](https://developer.android.com/reference/kotlin/java/util/concurrent/CompletableFuture.html)&lt;[Void](https://developer.android.com/reference/kotlin/java/lang/Void.html)&gt;

任意の文字列をCWS APIへ送信する。送信したメッセージはCWS API経由で事前設定したエンドポイントへ通知する。 この関数では、失敗時のメッセージとして送信する。 本処理の完了は`利用者(エンドポイント)` への到達を保証するものではありません。最終確認は`利用者(エンドポイント)` で行ってください。

アクティベート前に呼び出した場合は戻り値のCompletableFutureでNotActivatedExceptionをthrowする。 オフライン時に呼び出した場合はオンラインになった後にアクティベート後であれば送信する。

#### Return

呼び出し結果を戻すCompletableFuture。呼び出しに失敗した場合はCompletableFutureから例外を発行する。

#### Parameters

androidJvm

| | |
|---|---|
| customData | 送信したい任意の文字列（デフォルト: null）（任意項目）。nullの場合はcustomDataの要素無しで利用者のエンドポイントへ通知する。 |
