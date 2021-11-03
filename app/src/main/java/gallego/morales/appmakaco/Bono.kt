package gallego.morales.appmakaco

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class Bono : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buy_extra_bono)
    }

    fun resumeBono(view: android.view.View) {
        Toast.makeText(this, "Form ok", Toast.LENGTH_SHORT).show()
    }
   // @SuppressLint("WrongViewCast")
  //Switch list_toggle =findViewById(R.id.switch2);

}


