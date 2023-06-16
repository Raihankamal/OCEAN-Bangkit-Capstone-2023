package com.dicoding.raihan.capstoneocean.view.onboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.raihan.capstoneocean.R
import com.dicoding.raihan.capstoneocean.databinding.ActivityOnBoard1Binding
import com.dicoding.raihan.capstoneocean.databinding.ActivityOnBoard2Binding
import com.dicoding.raihan.capstoneocean.view.welcome.WelcomeActivity
import kotlinx.coroutines.delay

class OnBoardActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoard2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board2)
        binding = ActivityOnBoard2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        setupAction()
    }

    private fun setupAction() {
        binding.btnGetstarted.setOnClickListener {
            startActivity(Intent(this, WelcomeActivity::class.java))

        }

    }
}