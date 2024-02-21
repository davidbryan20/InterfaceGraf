package com.example.interfacegraf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<EditText>(R.id.txtNome)
        var buttonText = findViewById<Button>(R.id.buttonTxt)

        buttonText.setOnClickListener{
            val msg = "Olá, $name"
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }
}