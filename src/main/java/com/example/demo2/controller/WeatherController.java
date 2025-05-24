package com.example.demo2.controller;

import com.example.demo2.service.WeatherService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = {"https://www.corbinactivityhub.com", "http://localhost:3000"})
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/corbin")
    public Object getCorbinWeather() {
        return weatherService.getWeatherForCorbin();
    }

    @GetMapping("/currentCorbin")
    public Object getCurrentCorbin() {
        return weatherService.getCurrentWeather();
    }
}
