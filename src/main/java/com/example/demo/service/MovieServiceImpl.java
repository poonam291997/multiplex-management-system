package com.example.demo.service;

import com.example.demo.dao.MovieDAO;
import com.example.demo.dao.MovieDAOImpl;
import com.example.demo.model.Movie;
import com.example.demo.model.ScheduleTime;
import com.example.demo.model.SeatType;

import java.util.Map;

public class MovieServiceImpl implements MovieService{

    private MovieDAO movieDAO;
    public MovieServiceImpl() {
        movieDAO = new MovieDAOImpl();
    }

    @Override
    public void scheduleMovie(String name, String multiplexName, String screenName, ScheduleTime scheduleTime, Map<SeatType, Integer> categoryPrices) {
        Movie movie = new Movie();
        movie.setName(name);
        movie.setMultiplexName(multiplexName);
        movie.setScreenName(screenName);
        movie.setScheduleTime(scheduleTime);
        movie.setCategoryPrices(categoryPrices);
        movieDAO.scheduleMovie(movie);
    }
}
