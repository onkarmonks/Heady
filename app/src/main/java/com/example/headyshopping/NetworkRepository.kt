package com.example.headyshopping

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.headyshopping.models.StoreData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object NetworkRepository {

    fun getStoreData() {
        val apiService = RetrofitClient.create()

        val response = apiService.getStoreData()

        response.enqueue(object : Callback<StoreData> {

            override fun onResponse(call: Call<StoreData>, response: Response<StoreData>) {
                val result = response.body()
                if (result != null){
                    Log.w("Onkar", response.toString())
                }
            }

            override fun onFailure(call: Call<StoreData>, t: Throwable) {
                Log.w("Onkar", t.message)
            }
        })


    }
}