//[cwsSdk_v2.0.0](../../../index.md)/[ai.fd.thinklet.app.cwssdk](../index.md)/[CwsSdk](index.md)/[replyCommandResult](reply-command-result.md)

# replyCommandResult

[androidJvm]\
fun [replyCommandResult](reply-command-result.md)(customData: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, cwsRequestInfo: [CwsRequestInfo](../../ai.fd.thinklet.app.cwssdk.interface.cws/-cws-request-info/index.md), success: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [CompletableFuture](https://developer.android.com/reference/kotlin/java/util/concurrent/CompletableFuture.html)&lt;[Void](https://developer.android.com/reference/kotlin/java/lang/Void.html)&gt;

CWS APIから送信した「デバイスでコマンドを実行させるAPI」の実行結果と、任意の文字列をCWS APIへ送信する。送信したメッセージはCWS API経由で事前設定したエンドポイントへ通知する。 本処理の完了は`利用者(エンドポイント)` への到達を保証するものではありません。最終確認は`利用者(エンドポイント)` で行ってください。

アクティベート前に呼び出した場合は戻り値のCompletableFutureでNotActivatedExceptionをthrowする。 オフライン時に呼び出した場合はオンラインになった後にアクティベート後であれば送信する。

#### Return

呼び出し結果を戻すCompletableFuture。呼び出しに失敗した場合はCompletableFutureから例外を発行する。

#### Parameters

androidJvm

| | |
|---|---|
| customData | 送信したい任意の文字列（デフォルト: null）（任意項目）。nullの場合はcustomDataの要素無しで利用者のエンドポイントへ通知する。 |
| cwsRequestInfo | CWS APIのCommand API実行により、任意のアプリが呼び出された時に受信したintentから取得した情報。 |
| success | 送信メッセージに関連する動作の結果。 |
