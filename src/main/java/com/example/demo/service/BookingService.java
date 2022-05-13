package com.example.demo.service;

import com.example.demo.model.Filter;

import java.util.List;

public interface BookingService {

    void checkAvailability(List<Filter> filter);
}
