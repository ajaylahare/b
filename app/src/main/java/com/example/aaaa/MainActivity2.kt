package com.example.aaaa

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.acrivity_second.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acrivity_second)

       val bundle: Bundle? =intent.extras
        val ms = bundle!!.getString("use")
       // Toast.makeText(this, ms, Toast.LENGTH_SHORT).show()
        Text2.text = ms
        }
    }
