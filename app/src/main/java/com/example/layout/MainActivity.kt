package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customView.setTopText("Hello World!")
        binding.customView.setBottomText("Welcome to Android!")
    }
}