//[cwsSdk_v2.0.0](../../../index.md)/[ai.fd.thinklet.app.cwssdk.interface.cws.exception](../index.md)/[RequiredVersionCodeMethodNotFoundException](index.md)

# RequiredVersionCodeMethodNotFoundException

[androidJvm]\
class [RequiredVersionCodeMethodNotFoundException](index.md)(val cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) : [RequiredVersionCodeException](../-required-version-code-exception/index.md)

RequiredVersionCodeのチェックでMethodが存在しなかった場合のException

## Constructors

| | |
|---|---|
| [RequiredVersionCodeMethodNotFoundException](-required-version-code-method-not-found-exception.md) | [androidJvm]<br>constructor(cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [cause](../-cws-sdk-exception/cause.md) | [androidJvm]<br>open override val [cause](../-cws-sdk-exception/cause.md): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)? |
| [message](../-cws-request-info-get-failed-exception/index.md#1824300659%2FProperties%2F266414480) | [androidJvm]<br>open val [message](../-cws-request-info-get-failed-exception/index.md#1824300659%2FProperties%2F266414480): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](../-cws-request-info-get-failed-exception/index.md#282858770%2FFunctions%2F266414480) | [androidJvm]<br>fun [addSuppressed](../-cws-request-info-get-failed-exception/index.md#282858770%2FFunctions%2F266414480)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [fillInStackTrace](../-cws-request-info-get-failed-exception/index.md#-1102069925%2FFunctions%2F266414480) | [androidJvm]<br>open fun [fillInStackTrace](../-cws-request-info-get-failed-exception/index.md#-1102069925%2FFunctions%2F266414480)(): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [getLocalizedMessage](../-cws-request-info-get-failed-exception/index.md#1043865560%2FFunctions%2F266414480) | [androidJvm]<br>open fun [getLocalizedMessage](../-cws-request-info-get-failed-exception/index.md#1043865560%2FFunctions%2F266414480)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getStackTrace](../-cws-request-info-get-failed-exception/index.md#2050903719%2FFunctions%2F266414480) | [androidJvm]<br>open fun [getStackTrace](../-cws-request-info-get-failed-exception/index.md#2050903719%2FFunctions%2F266414480)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://developer.android.com/reference/kotlin/java/lang/StackTraceElement.html)&gt; |
| [getSuppressed](../-cws-request-info-get-failed-exception/index.md#672492560%2FFunctions%2F266414480) | [androidJvm]<br>fun [getSuppressed](../-cws-request-info-get-failed-exception/index.md#672492560%2FFunctions%2F266414480)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)&gt; |
| [initCause](../-cws-request-info-get-failed-exception/index.md#-418225042%2FFunctions%2F266414480) | [androidJvm]<br>open fun [initCause](../-cws-request-info-get-failed-exception/index.md#-418225042%2FFunctions%2F266414480)(p0: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)): [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |
| [message](message.md) | [androidJvm]<br>open override fun [message](message.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [printStackTrace](../-cws-request-info-get-failed-exception/index.md#-1769529168%2FFunctions%2F266414480) | [androidJvm]<br>open fun [printStackTrace](../-cws-request-info-get-failed-exception/index.md#-1769529168%2FFunctions%2F266414480)()<br>open fun [printStackTrace](../-cws-request-info-get-failed-exception/index.md#1841853697%2FFunctions%2F266414480)(p0: [PrintStream](https://developer.android.com/reference/kotlin/java/io/PrintStream.html))<br>open fun [printStackTrace](../-cws-request-info-get-failed-exception/index.md#1175535278%2FFunctions%2F266414480)(p0: [PrintWriter](https://developer.android.com/reference/kotlin/java/io/PrintWriter.html)) |
| [setStackTrace](../-cws-request-info-get-failed-exception/index.md#2135801318%2FFunctions%2F266414480) | [androidJvm]<br>open fun [setStackTrace](../-cws-request-info-get-failed-exception/index.md#2135801318%2FFunctions%2F266414480)(p0: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[StackTraceElement](https://developer.android.com/reference/kotlin/java/lang/StackTraceElement.html)&gt;) |
| [toString](../-cws-sdk-exception/to-string.md) | [androidJvm]<br>open override fun [toString](../-cws-sdk-exception/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
