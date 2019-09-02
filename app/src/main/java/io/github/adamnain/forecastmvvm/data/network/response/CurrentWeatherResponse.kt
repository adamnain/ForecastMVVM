package io.github.adamnain.forecastmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import io.github.adamnain.forecastmvvm.data.db.entity.CurrentWeatherEntry
import io.github.adamnain.forecastmvvm.data.db.entity.Location


data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location
)