package ipca.example.nameage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val TAG_ACTIVITY : String = "nameage"

    var editTextName : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        buttonOk.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        Log.d(TAG_ACTIVITY, editTextName!!.text.toString() )
        Log.d(TAG_ACTIVITY, editTextAge!!.text.toString() )
    }

}
