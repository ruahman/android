package com.example.velasexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.velas_framework.Velas

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Velas.Hello()
    }
}