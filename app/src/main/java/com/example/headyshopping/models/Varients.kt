package com.example.headyshopping.models

import com.google.gson.annotations.SerializedName

data class Varients(
    @SerializedName("color")
    val color: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("price")
    val price: Int,
    @SerializedName("size")
    val size: Int
)