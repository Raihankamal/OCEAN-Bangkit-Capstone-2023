package com.dicoding.raihan.capstoneocean.view.onboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.raihan.capstoneocean.R
import com.dicoding.raihan.capstoneocean.databinding.ActivityOnBoard1Binding
import com.dicoding.raihan.capstoneocean.databinding.ActivityOnBoardBinding
import com.dicoding.raihan.capstoneocean.view.welcome.WelcomeActivity

class OnBoardActivity1 : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoard1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoard1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        setupAction()
    }

    private fun setupAction() {
        binding.btn1Ob1.setOnClickListener {
            startActivity(Intent(this, OnBoardActivity2::class.java))
        }
        binding.btn2Ob1.setOnClickListener {
            startActivity(Intent(this, WelcomeActivity::class.java))
        }

    }
}