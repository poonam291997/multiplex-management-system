package com.example.demo.dao;

import com.example.demo.model.SeatType;

import java.util.List;
import java.util.Map;

public interface ScreenManagementDAO {

    void addScreen(String name, String multiplexName);
    void addSeat(Integer seatNumber, SeatType type, String screenName, String multiplexName);
    Map<SeatType, List<Integer>> getSeats();
}
