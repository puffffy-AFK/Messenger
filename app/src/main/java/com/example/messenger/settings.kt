package com.example.messenger

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }
    fun onClickGoMain(view : View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun onClickChangeBlack(view : View) {
        val screen = findViewById<View>(R.id.Screen)
        val screenMAIN = findViewById<View>(R.id.ScreenMAIN)
        screen.setBackgroundColor(Color.parseColor("#171717"))
    }
}


