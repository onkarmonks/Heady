package com.example.headyshopping.models

import com.google.gson.annotations.SerializedName

data class StoreData(
    @SerializedName("categories")
    val categories: List<Category>,
    @SerializedName("rankings")
    val rankings: List<Ranking>
)