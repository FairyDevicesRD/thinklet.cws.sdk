//[cwsSdk_v2.0.0](../../../index.md)/[ai.fd.thinklet.app.cwssdk.interface.cws](../index.md)/[CwsRequestInfo](index.md)

# CwsRequestInfo

class [CwsRequestInfo](index.md)(fromIntent: [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html))

CWS APIでの処理要求情報

#### Parameters

androidJvm

| | |
|---|---|
| fromIntent | CWS APIから送信，THINKLETで受信したIntent |

#### Throws

| | |
|---|---|
| [CwsRequestInfoGetFailedException](../../ai.fd.thinklet.app.cwssdk.interface.cws.exception/-cws-request-info-get-failed-exception/index.md) | fromIntentがCWS API由来ではない場合にThrowする |

## Constructors

| | |
|---|---|
| [CwsRequestInfo](-cws-request-info.md) | [androidJvm]<br>constructor(fromIntent: [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)) |

## Properties

| Name | Summary |
|---|---|
| [token](token.md) | [androidJvm]<br>val [token](token.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
