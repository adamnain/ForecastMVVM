package io.github.adamnain.forecastmvvm.data.network

import androidx.lifecycle.LiveData
import io.github.adamnain.forecastmvvm.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
}