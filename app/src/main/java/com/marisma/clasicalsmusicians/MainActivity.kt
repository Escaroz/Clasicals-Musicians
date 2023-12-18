package com.marisma.clasicalsmusicians

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, CreditActivity::class.java)
            val editText: EditText = findViewById(R.id.editText)
            val userName = editText.text.toString()
            intent.putExtra("userName", userName)
            startActivity(intent)
        }
    }
}

