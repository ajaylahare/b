package com.example.aaaa

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            Log.i("MainActivity", "Button was clicked")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }
            button2.setOnClickListener {
             val message: String=Text.text.toString()


                val intent= Intent(this,MainActivity2::class.java)
                intent.putExtra("use",message)
                startActivity(intent)
        }
        button3.setOnClickListener {
            val message: String=Text.text.toString()
             val intent =Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type="text/plan"
            startActivity(Intent.createChooser(intent,"share to:"))
            // HII I AM AJAY KUMAR LAHARE !!!! @@@@@ uuu mmm
        }
    }
}
