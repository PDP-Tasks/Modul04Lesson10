package dev.matyaqubov.modul04lesson10.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import dev.matyaqubov.modul04lesson10.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initViews()
    }

    private fun initViews() {
        countDownTimer()
    }

    private fun countDownTimer() {
        object : CountDownTimer(2000, 1000) {
            override fun onTick(l: Long) {

            }
            override fun onFinish() {
                val intent = Intent(this@SplashActivity, SingInActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}