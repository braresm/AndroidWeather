package com.example.weatherapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.domain.models.WeatherData

@Composable
fun DailyWeatherDisplay(
    dayDisplayName: String,
    weatherData: List<WeatherData>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = dayDisplayName,
            fontSize = 18.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyRow(content = {
            items(weatherData) { data ->
                HourlyWeatherDisplay(
                    weatherData = data,
                    modifier = Modifier
                        .height(100.dp)
                        .padding(horizontal = 8.dp)
                )
            }
        })
    }
}