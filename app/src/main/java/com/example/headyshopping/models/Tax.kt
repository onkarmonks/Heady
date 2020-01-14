package com.example.headyshopping.models

import com.google.gson.annotations.SerializedName

data class Tax(
    @SerializedName("name")
    val name: String,
    @SerializedName("value")
    val value: Double
)