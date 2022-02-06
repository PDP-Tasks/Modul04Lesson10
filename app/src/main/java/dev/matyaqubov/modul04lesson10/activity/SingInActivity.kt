package dev.matyaqubov.modul04lesson10.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import dev.matyaqubov.modul04lesson10.R

class SingInActivity : AppCompatActivity() {
    lateinit var et_email: EditText
    lateinit var et_password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
        initViews()
    }

    private fun initViews() {
        et_email = findViewById<EditText>(R.id.et_email)
        et_password = findViewById<EditText>(R.id.et_password)
        val button_singIn = findViewById<Button>(R.id.btn_signin)
        button_singIn.setOnClickListener { //logika
            Toast.makeText(this@SingInActivity, "Yaxhiiiiii", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@SingInActivity, HomeActivity::class.java)
            startActivity(intent)
        }
        val tv_singUp = findViewById<TextView>(R.id.tv_signup)
        tv_singUp.setOnClickListener {
            val intent = Intent(this@SingInActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}