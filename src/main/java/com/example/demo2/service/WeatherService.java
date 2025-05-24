package com.example.demo2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${openweathermap.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public Object getWeatherForCorbin() {
        String url = "https://api.openweathermap.org/data/2.5/forecast?q=Corbin,US&appid=" + apiKey + "&units=imperial";
        return restTemplate.getForObject(url, Object.class);
    }
    public Object getCurrentWeather() {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=Corbin,US&appid=" + apiKey + "&units=imperial";
        return restTemplate.getForObject(url, Object.class);
    }
}
