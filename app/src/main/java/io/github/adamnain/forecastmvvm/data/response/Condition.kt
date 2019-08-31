package io.github.adamnain.forecastmvvm.data.response


import com.google.gson.annotations.SerializedName

data class Condition(
    val code: Int,
    val icon: String,
    val text: String
)