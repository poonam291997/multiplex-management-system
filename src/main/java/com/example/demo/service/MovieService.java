package com.example.demo.service;

import com.example.demo.model.Schedule;
import com.example.demo.model.ScheduleTime;
import com.example.demo.model.SeatType;

import java.util.Map;

public interface MovieService {

    void scheduleMovie(String name, String multiplexName, String screenName, ScheduleTime scheduleTime,
                       Map<SeatType, Integer> categoryPrices);
}
