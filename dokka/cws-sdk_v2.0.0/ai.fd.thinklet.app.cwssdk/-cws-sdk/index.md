//[cwsSdk_v2.0.0](../../../index.md)/[ai.fd.thinklet.app.cwssdk](../index.md)/[CwsSdk](index.md)

# CwsSdk

class [CwsSdk](index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html))

CWS SDK

#### Parameters

androidJvm

| | |
|---|---|
| context | Context |

## Constructors

| | |
|---|---|
| [CwsSdk](-cws-sdk.md) | [androidJvm]<br>constructor(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) |

## Functions

| Name | Summary |
|---|---|
| [getCwsAuthorizationInfo](get-cws-authorization-info.md) | [androidJvm]<br>fun [getCwsAuthorizationInfo](get-cws-authorization-info.md)(): [CompletableFuture](https://developer.android.com/reference/kotlin/java/util/concurrent/CompletableFuture.html)&lt;[CwsAuthorizationInfo](../../ai.fd.thinklet.app.cwssdk.interface.cws/-cws-authorization-info/index.md)?&gt;<br>get Cws Authorization Info |
| [getCwsSdkVersion](get-cws-sdk-version.md) | [androidJvm]<br>fun [getCwsSdkVersion](get-cws-sdk-version.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>get CWS SDK version. |
| [getMdmVersionCode](get-mdm-version-code.md) | [androidJvm]<br>fun [getMdmVersionCode](get-mdm-version-code.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>get MDM service versionCode. |
| [getMdmVersionName](get-mdm-version-name.md) | [androidJvm]<br>fun [getMdmVersionName](get-mdm-version-name.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>get MDM service versionName. |
| [replyCommandResult](reply-command-result.md) | [androidJvm]<br>fun [replyCommandResult](reply-command-result.md)(customData: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, cwsRequestInfo: [CwsRequestInfo](../../ai.fd.thinklet.app.cwssdk.interface.cws/-cws-request-info/index.md), success: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [CompletableFuture](https://developer.android.com/reference/kotlin/java/util/concurrent/CompletableFuture.html)&lt;[Void](https://developer.android.com/reference/kotlin/java/lang/Void.html)&gt;<br>CWS APIから送信した「デバイスでコマンドを実行させるAPI」の実行結果と、任意の文字列をCWS APIへ送信する。送信したメッセージはCWS API経由で事前設定したエンドポイントへ通知する。 本処理の完了は`利用者(エンドポイント)` への到達を保証するものではありません。最終確認は`利用者(エンドポイント)` で行ってください。 |
| [sendErrorMessage](send-error-message.md) | [androidJvm]<br>fun [sendErrorMessage](send-error-message.md)(customData: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [CompletableFuture](https://developer.android.com/reference/kotlin/java/util/concurrent/CompletableFuture.html)&lt;[Void](https://developer.android.com/reference/kotlin/java/lang/Void.html)&gt;<br>任意の文字列をCWS APIへ送信する。送信したメッセージはCWS API経由で事前設定したエンドポイントへ通知する。 この関数では、失敗時のメッセージとして送信する。 本処理の完了は`利用者(エンドポイント)` への到達を保証するものではありません。最終確認は`利用者(エンドポイント)` で行ってください。 |
| [sendMessage](send-message.md) | [androidJvm]<br>fun [sendMessage](send-message.md)(customData: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [CompletableFuture](https://developer.android.com/reference/kotlin/java/util/concurrent/CompletableFuture.html)&lt;[Void](https://developer.android.com/reference/kotlin/java/lang/Void.html)&gt;<br>任意の文字列をCWS APIへ送信する。送信したメッセージはCWS API経由で事前設定したエンドポイントへ通知する。 この関数では、成功時のメッセージとして送信する。 本処理の完了は`利用者(エンドポイント)` への到達を保証するものではありません。最終確認は`利用者(エンドポイント)` で行ってください。 |
