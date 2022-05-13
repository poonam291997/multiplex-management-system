package com.example.demo.dao;

import com.example.demo.model.Movie;


import java.util.HashMap;
import java.util.Map;

public class MovieDAOImpl implements MovieDAO{

    private Map<String, Movie> movieMap;

    public MovieDAOImpl() {
        movieMap = new HashMap<>();
    }

    @Override
    public synchronized void scheduleMovie(Movie movie) {
        movieMap.put(movie.getName(), movie);
    }
}
