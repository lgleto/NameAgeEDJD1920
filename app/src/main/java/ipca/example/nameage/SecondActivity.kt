package ipca.example.nameage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import android.content.Intent
import android.net.Uri




class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)
        var name = ""
        var age = ""
        name = intent.getStringExtra(NAME_EXTRA)
        age = intent.getStringExtra(AGE_EXTRA)

        textViewName.text = name
        textViewAge.text = age

        buttonCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + age))
            startActivity(intent)
        }

    }

    companion object{
        val NAME_EXTRA = "ipca.example.nameage.SecondActivity.name"
        val AGE_EXTRA = "ipca.example.nameage.SecondActivity.age"
    }

}