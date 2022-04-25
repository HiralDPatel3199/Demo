package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fname = edtfname.text.toString()
        var lname = edtlname.text.toString()
        show.setOnClickListener{
            Toast.makeText(this, "${edtfname.text.toString() }+${ edtlname.text.toString()}", Toast.LENGTH_LONG).show()
        }
    }
}