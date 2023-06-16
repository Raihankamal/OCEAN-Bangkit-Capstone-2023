package com.dicoding.raihan.capstoneocean.view.login

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AlertDialog
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.ViewModelProvider
import com.dicoding.raihan.capstoneocean.R
import com.dicoding.raihan.capstoneocean.ViewModelFactory
import com.dicoding.raihan.capstoneocean.databinding.ActivityLoginBinding
import com.dicoding.raihan.capstoneocean.model.UserModel
import com.dicoding.raihan.capstoneocean.model.UserPreference
import com.dicoding.raihan.capstoneocean.view.main.MainActivity
import com.dicoding.raihan.capstoneocean.view.register.RegisterActivity

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

class LoginActivity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLoginBinding
    private lateinit var user: UserModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
        setupViewModel()
        setupAction()
    }

    private fun setupView() {
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        supportActionBar?.hide()
    }

    private fun setupViewModel() {
        loginViewModel = ViewModelProvider(
            this,
            ViewModelFactory(UserPreference.getInstance(dataStore))
        )[LoginViewModel::class.java]

        loginViewModel.getUser().observe(this, { user ->
            this.user = user
        })
    }

    private fun setupAction() {
        binding.LBtn1.setOnClickListener {
            val email = binding.LEdtEmail.text.toString()
            val password = binding.LEdtPass.text.toString()
            when {
                email.isEmpty() -> {
                    binding.LEdtEmail.error = "Masukkan email"
                }
                password.isEmpty() -> {
                    binding.LEdtPass.error = "Masukkan password"
                }
                email != user.email -> {
                    binding.LEdtEmail.error = "Email tidak sesuai"
                }
                password != user.password -> {
                    binding.LEdtPass.error = "Password tidak sesuai"
                }
                else -> {
                    loginViewModel.login()
                    AlertDialog.Builder(this).apply {
                        setTitle("Yeah!")
                        setMessage("Anda berhasil login. Sudah tidak sabar untuk uji kemampuan diri ya?")
                        setPositiveButton("Lanjut") { _, _ ->
                            val intent = Intent(context, MainActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                            startActivity(intent)
                            finish()
                        }
                        create()
                        show()
                    }
                }
            }
        }

        binding.txtRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding.LImg1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

