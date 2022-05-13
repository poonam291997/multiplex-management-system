package com.example.demo.dao;

import com.example.demo.model.Movie;
import com.example.demo.model.ScheduleTime;
import com.example.demo.model.SeatType;

import java.util.Map;

public interface MovieDAO {

    void scheduleMovie(Movie movie);
}
