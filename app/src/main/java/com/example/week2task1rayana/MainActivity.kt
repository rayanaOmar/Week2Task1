package com.example.week2task1rayana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var nameText: EditText
    lateinit var mobileText: EditText
    lateinit var locationText: EditText
    lateinit var toaBtu: Button
    lateinit var tvBtu: Button
    lateinit var goBtu: Button
    lateinit var tvMain: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //The main layout:
        val layout = findViewById<ConstraintLayout>(R.id.clMain)

        //the EditText:
        nameText = findViewById(R.id.nameText)
        mobileText = findViewById(R.id.mobileText)
        locationText = findViewById(R.id.locationText)

        tvMain = findViewById(R.id.tvMain)

        //The Button:
        toaBtu = findViewById(R.id.toaButton)
        tvBtu = findViewById(R.id.tvButton)
        goBtu = findViewById(R.id.goButton)

        //Store the text into list to display
        val list = listOf(nameText.text, locationText.text , mobileText.text)

        //toa button --> use show toast to display the list
        toaBtu.setOnClickListener {
            Toast.makeText(applicationContext,list.toString(),Toast.LENGTH_SHORT).show()
        }

        //tv button --> show the list inside textView
        tvBtu.setOnClickListener {
            tvMain.text = list.toString()
        }

        //go button --> go to another activity
        goBtu.setOnClickListener {
            val intent = Intent(this, printOut::class.java)
            intent.putExtra("Text", "Hi, it is the 2nd Activity")
            startActivity(intent)
        }
    }
}