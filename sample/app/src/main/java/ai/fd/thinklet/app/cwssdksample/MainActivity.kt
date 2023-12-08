package ai.fd.thinklet.app.cwssdksample

import ai.fd.thinklet.app.cwssdk.CwsSdk
import ai.fd.thinklet.app.cwssdksample.databinding.ActivityMainBinding
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private companion object {
        const val TAG = "CwsSdkSample"
    }

    private val binding: ActivityMainBinding by lazy {
        // activity_main.xml
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val cws = CwsSdk(context = applicationContext)

        // バージョンを取得して画面に出力
        binding.textviewSdkVersion.text = cws.getCwsSdkVersion()
        binding.textviewMdmVersion.text = "${cws.getMdmVersionName()}(${cws.getMdmVersionCode()})"

        // ボタン押下で認証情報の取得実行
        binding.buttonGetCwsAuthorization.setOnClickListener {
            val completableFuture = cws.getCwsAuthorizationInfo()
            completableFuture.whenComplete { cwsAuthorizationInfo, throwable ->
                Log.i(TAG, "throwable: $throwable")

                CoroutineScope(Dispatchers.Main).launch {
                    // メインスレッドで結果を画面に出力
                    binding.textviewCwsAuthorizationInfoResult.text =
                        if (null == cwsAuthorizationInfo || null != throwable) {
                            "failure"
                        } else {
                            "success"
                        }
                    cwsAuthorizationInfo?.also {
                        binding.textviewCwsApplicationId.text = it.applicationId
                        binding.textviewCwsClientId.text = it.clientId
                        binding.textviewCwsClientSecret.text = it.clientSecret
                    }
                }
            }
        }
    }
}
