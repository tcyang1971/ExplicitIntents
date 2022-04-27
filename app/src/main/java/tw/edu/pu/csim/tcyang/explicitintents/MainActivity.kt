package tw.edu.pu.csim.tcyang.explicitintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var btnNext: Button
    lateinit var edt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext = findViewById(R.id.btnNext)
        edt = findViewById(R.id.edt)
        edt.setText("https://www.pu.edu.tw")

        btnNext.setOnClickListener({
            var it = Intent(this@MainActivity, SecondActivity::class.java).apply {
                putExtra("website", edt.text.toString())
            }
            startActivity(it)
        })

    }
}