package com.example.demo.service;

import com.example.demo.model.SeatType;

public interface ScreenManagementService {

    // add screen id to given multiplex name
    void addScreen(String name, String multiplexName);
    void addSeat(Integer seatNumber, SeatType type, String name, String multiplexName);
}
