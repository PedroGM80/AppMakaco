package gallego.morales.appmakaco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goBonoLayout(view: android.view.View) {
        val intent = Intent(this, Bono::class.java)
        startActivity(intent)
    }

    fun goPaydMethod(view: android.view.View) {
        val intent = Intent(this, PaydMethod::class.java)
        startActivity(intent)
    }
    fun goConfig(view: android.view.View) {
        val intent = Intent(this, UserConfig::class.java)
        startActivity(intent)
    }
}


