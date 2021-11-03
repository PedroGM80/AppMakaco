package gallego.morales.appmakaco

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PaydMethod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.change_pay_method)
    }

    fun valid(view: android.view.View) {
 var acept=R.id.checkBox.toString()
var ok=0
        var myNewInt: Int = R.id.cardPsw.toString().toInt()
        var myTarget: String = R.id.cvc.toString()

        if(acept.equals("true")){
            Toast.makeText(this, "Terms acepted", Toast.LENGTH_SHORT).show()
            ok++
        }else{
            Toast.makeText(this, "You must acept terms", Toast.LENGTH_SHORT).show()
        }
        if(myTarget.length<16 || myTarget.get(0) !='3' || myTarget.get(0) !='5' || myTarget.get(0) !='7' ) {
            Toast.makeText(this, "Error in your number targed", Toast.LENGTH_SHORT).show()
        }else{
            ok++
          if(ok==2) {
              Toast.makeText(this, "Form ok", Toast.LENGTH_SHORT).show()
          }
        }

        }

    fun selctTarged(view: android.view.View) {
        var cardPsw=View.VISIBLE;
        var cvc=View.VISIBLE;
        var paypaluser=View.INVISIBLE
        var editTextTextPassword2=View.INVISIBLE
    }
    fun selctPaypal(view: android.view.View) {
        var cardPsw=View.INVISIBLE;
        var cvc=View.INVISIBLE;
        var paypaluser=View.VISIBLE
        var editTextTextPassword2=View.VISIBLE
    }
}
