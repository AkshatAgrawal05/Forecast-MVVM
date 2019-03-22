package com.example.forecastmvvm.data.network.response

import com.example.forecastmvvm.data.db.entity.CurrentWeatherEntry
import com.example.forecastmvvm.data.db.entity.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

    @field:SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry? = null,

    @field:SerializedName("location")
    val location: Location? = null
)