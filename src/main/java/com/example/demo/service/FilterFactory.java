package com.example.demo.service;

public class FilterFactory {

    public FilterService getFilter(String name) {
        switch(name) {
            case "MOVIE" :
                return new MovieFilterService();
            default:
                return null;
        }
    }
}
