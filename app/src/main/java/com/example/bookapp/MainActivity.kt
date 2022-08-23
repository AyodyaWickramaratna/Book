package com.example.bookapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bookapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //handle click,login
        binding.LoginBtn.setOnClickListener {

            startActivity(Intent(this,LoginActivity::class.java))
        }

        //hand click, skip and continue to main screen
        binding.skipBtn.setOnClickListener {

            startActivity(Intent(this, DashboardUserActivity::class.java))
        }
    }
}