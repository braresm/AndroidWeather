package com.example.weatherapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.weatherapp.ui.view.WeatherState

@Composable
fun WeatherForecast(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    val todayWeatherData = state.weatherInfo?.dayWeather?.get(0)
    if (todayWeatherData != null) {
        DailyWeatherDisplay(
            dayDisplayName = "Today",
            weatherData = todayWeatherData,
            modifier = modifier
        )
    }
}