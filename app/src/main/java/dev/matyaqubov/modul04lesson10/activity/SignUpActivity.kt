package dev.matyaqubov.modul04lesson10.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import dev.matyaqubov.modul04lesson10.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        initViews()
    }

    private fun initViews() {
        val btn_SignUp = findViewById<Button>(R.id.btn_signup)
        btn_SignUp.setOnClickListener { finish() }
        val tv_singIn = findViewById<TextView>(R.id.tv_signin)
        tv_singIn.setOnClickListener { finish() }
    }
}