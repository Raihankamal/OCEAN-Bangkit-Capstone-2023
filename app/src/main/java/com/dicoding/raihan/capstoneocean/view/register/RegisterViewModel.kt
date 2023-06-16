package com.dicoding.raihan.capstoneocean.view.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.raihan.capstoneocean.model.UserModel
import com.dicoding.raihan.capstoneocean.model.UserPreference
import kotlinx.coroutines.launch

class RegisterViewModel (private val pref: UserPreference) : ViewModel() {
    fun saveUser(user: UserModel) {
        viewModelScope.launch {
            pref.saveUser(user)
        }
    }
}