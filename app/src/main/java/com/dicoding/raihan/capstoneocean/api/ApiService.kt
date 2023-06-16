package com.dicoding.raihan.capstoneocean.api

import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("nama")
    fun getNama(NAMA_ID: String): Call<DataResponseItem>

    @GET("nama/{_id}")
    fun getNamaById(
        @Path("_id") id: String
    ): Call<DataResponseItem>



    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("_id") id: String,
        @Field("nama") name: String,
        @Field("tempat_lahir") review: String
    ): Call<DataResponseItem>
}