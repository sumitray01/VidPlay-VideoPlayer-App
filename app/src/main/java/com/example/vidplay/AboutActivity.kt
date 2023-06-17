package com.example.vidplay

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vidplay.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.themesList[MainActivity.themeIndex])
        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = "Developed By: Sumit Ray \n\nIf you want to provide feedback, I will love to hear that."
    }
}