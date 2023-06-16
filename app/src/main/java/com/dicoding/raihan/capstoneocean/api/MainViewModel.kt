package com.dicoding.raihan.capstoneocean.api

import android.content.res.Resources
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bumptech.glide.load.engine.Resource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel {

    private val _Data = MutableLiveData<DataResponseItem>()
    val Data: LiveData<DataResponseItem> = _Data

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    companion object{
        private const val TAG = "MainViewModel"
        private const val NAMA_ID = "647828b5bed7b62e21081709"
    }

    init {
        findName()
    }

    private fun findName() {
//        _isLoading.value = true
//        val client = ApiConfig.getApiService().getNama(NAMA_ID)
//        client.enqueue(object : Callback<DataResponseItem> {
//            override fun onResponse(
//                call: Call<DataResponseItem>,
//                response: Response<DataResponseItem>
//            ) {
//                _isLoading.value = false
//                if (response.isSuccessful) {
//                    _Data.value = response.body()?.tempatLahir{ Resource.Success(it) }
//                    Log.d("TAG", "onResponsea: ${_Data.value?.nama}")
//                }
//                } else {
//                    Log.e(TAG, "onFailure: ${response.message()}")
//                }
//            }
//
//            override fun onFailure(call: Call<RestaurantResponse>, t: Throwable) {
//                _isLoading.value = false
//                Log.e(TAG, "onFailure: ${t.message.toString()}")
//            }
//        })
    }

    fun postReview(review: String) {
//        _isLoading.value = true
//        val client = ApiConfig.getApiService().postReview(RESTAURANT_ID, "Dicoding", review)
//        client.enqueue(object : Callback<PostReviewResponse> {
//            override fun onResponse(call: Call<PostReviewResponse>, response: Response<PostReviewResponse>) {
//                _isLoading.value = false
//                if (response.isSuccessful) {
//                    _listReview.value = response.body()?.customerReviews
//                } else {
//                    Log.e(TAG, "onFailure: ${response.message()}")
//                }
//            }
//            override fun onFailure(call: Call<PostReviewResponse>, t: Throwable) {
//                _isLoading.value = false
//                Log.e(TAG, "onFailure: ${t.message.toString()}")
//            }
//        })
    }
}