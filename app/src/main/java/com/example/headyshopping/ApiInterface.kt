package com.example.headyshopping

import com.example.headyshopping.models.StoreData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("json")
    fun getStoreData(): Call<StoreData>
}