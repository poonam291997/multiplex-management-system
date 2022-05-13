package com.example.demo.model;

import java.util.Map;

public class Movie {

    String name;
    String multiplexName;
    String screenName;
    ScheduleTime scheduleTime;
    Map<SeatType, Integer> categoryPrices;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMultiplexName() {
        return multiplexName;
    }

    public void setMultiplexName(String multiplexName) {
        this.multiplexName = multiplexName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public ScheduleTime getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(ScheduleTime scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Map<SeatType, Integer> getCategoryPrices() {
        return categoryPrices;
    }

    public void setCategoryPrices(Map<SeatType, Integer> categoryPrices) {
        this.categoryPrices = categoryPrices;
    }
}
