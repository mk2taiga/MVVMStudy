package com.example.mvvmstudy.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmstudy.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, MainFragment())
                .commit()
        }
    }
}
