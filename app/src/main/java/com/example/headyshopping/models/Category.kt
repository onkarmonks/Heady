package com.example.headyshopping.models

import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("child_categories")
    val childCategories: List<Int>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("products")
    val products: List<Products>
)