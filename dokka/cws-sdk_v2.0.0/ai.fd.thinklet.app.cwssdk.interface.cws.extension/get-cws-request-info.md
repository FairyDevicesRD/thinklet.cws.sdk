//[cwsSdk_v2.0.0](../../index.md)/[ai.fd.thinklet.app.cwssdk.interface.cws.extension](index.md)/[getCwsRequestInfo](get-cws-request-info.md)

# getCwsRequestInfo

[androidJvm]\
fun [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html).[getCwsRequestInfo](get-cws-request-info.md)(): [CwsRequestInfo](../ai.fd.thinklet.app.cwssdk.interface.cws/-cws-request-info/index.md)

Intentから、CWS APIからの要求情報を取得するための関数

#### Throws

| | |
|---|---|
| [CwsRequestInfoGetFailedException](../ai.fd.thinklet.app.cwssdk.interface.cws.exception/-cws-request-info-get-failed-exception/index.md) | fromIntentがCWS API由来ではない場合にThrowする |
