package com.example.headyshopping.models

import com.google.gson.annotations.SerializedName

data class ProductsRanking(
    @SerializedName("id")
    val id: Int,
    @SerializedName("view_count")
    val views: Int,
    @SerializedName("order_count")
    val orders: Int,
    @SerializedName("shares")
    val shares: Int
)