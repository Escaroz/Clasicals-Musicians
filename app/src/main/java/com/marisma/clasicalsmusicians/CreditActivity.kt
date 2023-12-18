package com.marisma.clasicalsmusicians

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        val userName = intent.getStringExtra("userName")

        val textView: TextView = findViewById(R.id.textView)
        textView.text = "Usuario $userName gracias por usar la versión 1 de la aplicación."

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse("mailto:tu_direccion_de_correo@gmail.com")
            emailIntent.putExtra(
                Intent.EXTRA_SUBJECT,
                "Consulta de la app " + intent.getStringExtra("nombreApp")
            )
            startActivity(emailIntent)
        })
    }
}