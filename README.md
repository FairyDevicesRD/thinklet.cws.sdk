# THINKLET CWS SDK

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![License: CC BY-SA 4.0](https://img.shields.io/badge/License-CC_BY--SA_4.0-lightgrey.svg)](https://creativecommons.org/licenses/by-sa/4.0/)

## 目次
- [概要](#概要)
  - [動作要件](#動作要件)
  - [利用注意事項](#利用注意事項)
  - [ライセンス](#ライセンス)
  - [CWS SDK ドキュメント](#cws-sdk-ドキュメント)
  - [サンプルコード](#サンプルコード)
- [機能一覧](#機能一覧)
  - [CWS SDK](#cws-sdk)
    - [API Document](#api-document)
    - [Get Version](#get-version)
    - [CWS API Authorization Info](#cws-api-authorization-info)
    - [Send Message/Send Error Message](#send-messagesend-error-message)
    - [Reply Command Result](#reply-command-result)
- [プロジェクトでの利用方法](#プロジェクトでの利用方法)
  - [GitHub Packages経由](#github-packages経由)
  - [更新方法](#更新方法)
- [Tips](#tips)
  - [AARのバージョンの確認](#aarのバージョンの確認)

## 概要
- THINKLET CWS SDK（以下 CWS SDK）は、[CWS API](https://fairydevices.jp/cws)の機能を使用するためのSDKです。
- [CWS API](https://fairydevices.jp/cws) とは、THINKLETに対して遠隔から操作・設定を行うためのAPIです。
- [CWS API](https://fairydevices.jp/cws)の契約を行った上で、THINKLET本体にインストールするアプリケーションでの利用が可能です。

### 動作要件
- 各機能に対する動作要件は以下です。
  - ファームウェアのバージョンが、下記表の「ファームウェアのバージョン」を満たすこと
  - または、依存アプリである `ai.fd.thinklet.app.mdmclient` が下記表の「依存アプリの必須VersionName/VersionCode」を満たすこと

|機能|CWS APIの契約要否|依存アプリの必須VersionName|依存アプリの必須VersionCode|ファームウェアのバージョン|備考|
|---|---|---|---|---|---|
|[Get Version](#get-version)|否|-|-|-|-|
|[CWS API Authorization Info](#cws-api-authorization-info)|要|0.3.6以上|7以上|3.2.0以上|CWS APIでアクティベート成功後に取得可能|
|[Send Message/Send Error Message](#send-messagesend-error-message)|要|0.6.21以上|8以上|7.000.0以上|CWS APIでアクティベート成功後に実行可能|
|[Reply Command Result](#reply-command-result)|要|0.6.21以上|8以上|7.000.0以上|CWS APIでアクティベート成功後に実行可能|

- MDMアプリのVersionName/VersionCode は以下でご確認ください。
  ```sh
  $ adb shell dumpsys package ai.fd.thinklet.app.mdmclient | grep version
  ```

- ファームウェアのバージョンは以下でご確認ください。
  ```sh
  $ adb shell getprop ro.sys.fd.version
  ```

### 利用注意事項
- 配布するライブラリについては、リバースエンジニアリングを禁止します。
- ライブラリおよびこれを利用するサンプルソースコードは、THINKLET実機でのみ動作します。
- その他の取り扱い情報については、[MITライセンス](./LICENSE) を参照してください。

### ライセンス
- SDKと[サンプルソースコード](./sample)は[MITライセンス](./LICENSE)の元で公開します
- [ドキュメント](./dokka/index.md)は[CC BY-SA 4.0](./dokka/LICENSE)の元で公開します

### CWS SDK ドキュメント
- [dokka](./dokka/index.md) を参照ください。

### サンプルコード
- [sample](./sample) を参照ください。

## 機能一覧
### CWS SDK
#### API Document
- [API](./dokka/index.md)

#### Get Version
- 動作しているMDM・CWS SDKのバージョン情報を取得します。
- 呼び出し例は以下です。
  ```.kt
  val cws = CwsSdk(context = applicationContext)
  Log.d(TAG, "CwsSDK Version: ${cws.getCwsSdkVersion()}")
  Log.d(TAG, "MDM VersionName: ${cws.getMdmVersionName()}")
  Log.d(TAG, "MDM VersionCode: ${cws.getMdmVersionCode()}")
  ```

#### CWS API Authorization Info
- [CWS API](https://fairydevices.jp/cws)の認証情報を取得します。
- 呼び出し例は以下です。
  ```.kt
  val completableFuture = cws.getCwsAuthorizationInfo()
  completableFuture.whenComplete { cwsAuthorizationInfo, throwable ->
      Log.d(TAG, "CWS API applicationId: ${cwsAuthorizationInfo?.applicationId}")
      Log.d(TAG, "CWS API clientId: ${cwsAuthorizationInfo?.clientId}")
      Log.d(TAG, "CWS API clientSecret: ${cwsAuthorizationInfo?.clientSecret}")
  }
  ```

#### Send Message/Send Error Message
- 利用者のアプリから、`customData` に指定した任意の文字列をCWS APIへ送信します。
- このメッセージはCWS API経由で `デバイスイベント通知先URL` へ `トランザクション結果通知(コマンド実行)` として `利用者(エンドポイント)` へWebhookで送信します。
  - 詳細はCWS APIのAPI仕様 「T-1-7 通知・アクセス設定」 などをご確認ください。
- 本処理の完了は`利用者(エンドポイント)` への到達を保証するものではありません。最終確認は`利用者(エンドポイント)` で行ってください。
- 全体のシーケンスは以下です。
  ```mermaid
  sequenceDiagram
      participant USERAPP as 利用者(アプリ)
      participant CWSAPP as CWS API連携アプリ
      participant CWS as CWS API
      participant USER as 利用者(エンドポイント)
      USERAPP ->> CWSAPP: 利用者のアプリからCWS SDK呼び出し
      CWSAPP ->> CWS: 利用者のアプリから受け取った内容を送信
      Note left of USER: デバイスイベント通知先URL へ トランザクション結果通知(コマンド実行) として送信
      CWS ->> USER: 利用者のアプリから受け取った内容を送信
  ```

- 呼び出し例は以下です。
  ```.kt
  // send message
  val sendMessageFuture = cws.sendMessage(customData = "send custom data.")
  sendMessageFuture.whenComplete { _, throwable ->
      var message = "success"
      throwable?.message?.also { throwableMessage ->
          message = throwableMessage
      }
      Log.d(TAG, "sendMessage result message: $message")
  }

  // send error message
  val sendErrorMessageFuture = cws.sendErrorMessage(customData = "send custom error data.")
  sendErrorMessageFuture.whenComplete { _, throwable ->
      var message = "success"
      throwable?.message?.also { throwableMessage ->
          message = throwableMessage
      }
      Log.d(TAG, "sendErrorMessage result message: $message")
  }
  ```

#### Reply Command Result
- 「デバイスでコマンドを実行させる」APIの要求に対して、呼び出された利用者のアプリが、その結果をCWS APIへ返却するために使用するインターフェースです。
- 結果返却時に、`customData` に指定した任意の文字列をCWS APIへ送信します。
- このメッセージはCWS API経由で `デバイスイベント通知先URL` へ `トランザクション結果通知(コマンド実行)` としてWebhookで送信します。
  - 詳細はCWS APIのAPI仕様 「T-1-7 通知・アクセス設定」 などをご確認ください。
- 本処理の完了は`利用者(エンドポイント)` への到達を保証するものではありません。最終確認は`利用者(エンドポイント)` で行ってください。
- 全体のシーケンスは以下です。
  ```mermaid
  sequenceDiagram
      participant USERAPP as 利用者(アプリ)
      participant CWSAPP as CWS API連携アプリ
      participant CWS as CWS API
      participant USER as 利用者(エンドポイント)

      USER ->> CWS: 「デバイスでコマンドを実行させる」APIを実行
      CWS ->> CWSAPP: 利用者のアプリを呼び出すためのメッセージ送信
      CWSAPP ->> USERAPP: 利用者のアプリを呼び出し（APIでの指定内容）
      USERAPP ->> USERAPP: 任意の処理
      USERAPP ->> CWSAPP: 利用者のアプリからCWS SDK呼び出し
      CWSAPP ->> CWS: 利用者のアプリから受け取った内容を送信
      Note left of USER: デバイスイベント通知先URL へ トランザクション結果通知(コマンド実行) として送信
      CWS ->> USER: 利用者のアプリから受け取った内容を送信
  ```

- 呼び出し例は以下です。
  ```.kt
  // intentは、利用者のアプリが呼び出された時に受け取ったintentを指定
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
  }
  ```

## プロジェクトでの利用方法
### GitHub Packages経由
- 詳細な設定は、[GitHub 公開されたパッケージの利用](https://docs.github.com/ja/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry#using-a-published-package) を参照ください。
- また、バージョンの指定や依存ライブラリの追加が必要な場合は、`Release` に記載しておりますので、適宜ご確認ください。
- 以下に、サンプルを記載します。
  - root `build.gradle`

    ```
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/FairyDevicesRD/thinklet.cws.sdk")
        credentials {
            Properties properties = new Properties()
            properties.load(project.rootProject.file('local.properties').newDataInputStream())
            username = properties.getProperty("username") ?: System.getenv("USERNAME")
            password = properties.getProperty("token") ?: System.getenv("TOKEN")
        }
    }
    ```

  - `app/build.gradle`

    ```
    dependencies {
        implementation 'ai.fd.thinklet:cws-sdk:XXX'
    }
    // XXX にはVersionを指定ください。とにかく最新を使用する場合は、`+` に置き換えてください。
    ```

### 更新方法
- implementation で指定するVersionを変更してください。
- その後、プロジェクトをクリーン＆ビルドしてください。

## Tips
### AARのバージョンの確認
- 各種AARの `BuildConfig.LIBRARY_VERSION` を参照してください。

```.kt
val msg = "${ai.fd.thinklet.app.cwssdk.BuildConfig.LIBRARY_PACKAGE_NAME}: ${ai.fd.thinklet.app.cwssdk.BuildConfig.LIBRARY_VERSION}"
Log.v(TAG, msg)
```
