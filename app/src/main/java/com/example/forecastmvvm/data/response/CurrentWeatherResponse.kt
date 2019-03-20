package com.example.forecastmvvm.data.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

    @field:SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry? = null,

    @field:SerializedName("location")
    val location: Location? = null
)