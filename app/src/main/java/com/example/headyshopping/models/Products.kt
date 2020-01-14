package com.example.headyshopping.models

import com.google.gson.annotations.SerializedName

data class Products(
    @SerializedName("date_added")
    val dateAdded: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("tax")
    val tax: Tax,
    @SerializedName("variants")
    val variants: List<Varients>
)