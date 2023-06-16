package com.dicoding.raihan.capstoneocean.view.onboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.raihan.capstoneocean.R
import com.dicoding.raihan.capstoneocean.databinding.ActivityOnBoardBinding
import com.dicoding.raihan.capstoneocean.databinding.ActivityRegisterBinding
import com.dicoding.raihan.capstoneocean.databinding.ActivityWelcomeBinding
import com.dicoding.raihan.capstoneocean.view.login.LoginActivity
import com.dicoding.raihan.capstoneocean.view.register.RegisterActivity
import com.dicoding.raihan.capstoneocean.view.welcome.WelcomeActivity

class OnBoardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board)
        binding = ActivityOnBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        setupAction()
    }

    private fun setupAction() {
        binding.btn1Ob.setOnClickListener {
            startActivity(Intent(this, OnBoardActivity1::class.java))
        }
        binding.btn2Ob.setOnClickListener {
            startActivity(Intent(this, WelcomeActivity::class.java))
        }

    }

}