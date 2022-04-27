package tw.edu.pu.csim.tcyang.explicitintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var btnBack: Button
    lateinit var webv: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        webv = findViewById(R.id.webv)
        val website:String? = intent.getStringExtra("website")
        if (website != null){
            webv.loadUrl(website)
        }

        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener({
            finish()
        })
    }
}