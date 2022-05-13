package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

public class Screen {

    private String name;
    private Map<SeatType, Integer> totalSeatsMap;
    private Map<Integer, SeatType> seatTypeMap;

    public Screen(String name) {
        this.name = name;
        totalSeatsMap = new HashMap<>();
        seatTypeMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<SeatType, Integer> getTotalSeatsMap() {
        return totalSeatsMap;
    }

    public void setTotalSeatsMap(Map<SeatType, Integer> totalSeatsMap) {
        this.totalSeatsMap = totalSeatsMap;
    }

    public Map<Integer, SeatType> getSeatTypeMap() {
        return seatTypeMap;
    }

    public void setSeatTypeMap(Map<Integer, SeatType> seatTypeMap) {
        this.seatTypeMap = seatTypeMap;
    }
}
