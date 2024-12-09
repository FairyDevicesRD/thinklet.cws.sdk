//[cwsSdk_v2.0.0](../../../index.md)/[ai.fd.thinklet.app.cwssdk.interface.cws.exception](../index.md)/[CwsRequestInfoGetFailedException](index.md)

# CwsRequestInfoGetFailedException

[androidJvm]\
class [CwsRequestInfoGetFailedException](index.md)(val cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) : [CwsSdkException](../-cws-sdk-exception/index.md)

CwsRequestInfo の取得に失敗した場合のException

## Constructors

| | |
|---|---|
| [CwsRequestInfoGetFailedException](-cws-request-info-get-failed-exception.md) | [androidJvm]<br>constructor(cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [cause](../-cws-sdk-exception/cause.md) | [androidJvm]<br>open override val [cause](../-cws-sdk-exception/cause.md): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](index.md#1824300659%2FProperties%2F266414480) | [androidJvm]<br>open val [message](index.md#1824300659%2FProperties%2F266414480): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](index.md#282858770%2FFunctions%2F266414480) | [androidJvm]<br>fun [addSuppressed](index.md#282858770%2FFunctions%2F266414480)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](index.md#-1102069925%2FFunctions%2F266414480) | [androidJvm]<br>open fun [fillInStackTrace](index.md#-1102069925%2FFunctions%2F266414480)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](index.md#1043865560%2FFunctions%2F266414480) | [androidJvm]<br>open fun [getLocalizedMessage](index.md#1043865560%2FFunctions%2F266414480)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](index.md#2050903719%2FFunctions%2F266414480) | [androidJvm]<br>open fun [getStackTrace](index.md#2050903719%2FFunctions%2F266414480)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://developer.android.com/reference/kotlin/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](index.md#672492560%2FFunctions%2F266414480) | [androidJvm]<br>fun [getSuppressed](index.md#672492560%2FFunctions%2F266414480)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](index.md#-418225042%2FFunctions%2F266414480) | [androidJvm]<br>open fun [initCause](index.md#-418225042%2FFunctions%2F266414480)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [message](message.md) | [androidJvm]<br>open override fun [message](message.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [printStackTrace](index.md#-1769529168%2FFunctions%2F266414480) | [androidJvm]<br>open fun [printStackTrace](index.md#-1769529168%2FFunctions%2F266414480)()<br>open fun [printStackTrace](index.md#1841853697%2FFunctions%2F266414480)(p0: [PrintStream](https://developer.android.com/reference/kotlin/java/io/PrintStream.html))<br>open fun [printStackTrace](index.md#1175535278%2FFunctions%2F266414480)(p0: [PrintWriter](https://developer.android.com/reference/kotlin/java/io/PrintWriter.html)) |
| [setStackTrace](index.md#2135801318%2FFunctions%2F266414480) | [androidJvm]<br>open fun [setStackTrace](index.md#2135801318%2FFunctions%2F266414480)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://developer.android.com/reference/kotlin/java/lang/StackTraceElement.html)&gt;) |
| [toString](../-cws-sdk-exception/to-string.md) | [androidJvm]<br>open override fun [toString](../-cws-sdk-exception/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
