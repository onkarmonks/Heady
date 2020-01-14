package com.example.headyshopping.models

import com.google.gson.annotations.SerializedName

data class Ranking(
    @SerializedName("products")
    val products: List<ProductsRanking>,
    @SerializedName("ranking")
    val ranking: String
)