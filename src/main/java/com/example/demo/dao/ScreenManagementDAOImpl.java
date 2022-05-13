package com.example.demo.dao;

import com.example.demo.model.Screen;
import com.example.demo.model.Seat;
import com.example.demo.model.SeatType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScreenManagementDAOImpl implements ScreenManagementDAO {

    Map<String, Screen> screenMap = new HashMap<>();
    private MultiplexManagementDAO multiplexManagementDAO;
    public ScreenManagementDAOImpl() {
        multiplexManagementDAO = new MultiplexManagementDAOImpl();
    }

    @Override
    public synchronized void addScreen(String name, String multiplexName) {
        Screen screen = new Screen(name);
        screenMap.put(name, screen);
        multiplexManagementDAO.addScreen(screen, multiplexName);
    }

    public Map<SeatType, List<Integer>> getSeats() {
        Map<SeatType, List<Integer>> map = new HashMap<>();
        for(Map.Entry screen : screenMap.entrySet()) {
            for(Map.Entry entry : ((Screen)screen.getKey()).getSeatTypeMap().entrySet()) {
                Integer key = (Integer)entry.getKey();
                SeatType value = (SeatType) entry.getValue();
                map.get(value).add(key);
            }
        }
        return map;
    }

    @Override
    public synchronized void addSeat(Integer seatNumber, SeatType type, String screenName, String multiplexName) {
        Screen screen = screenMap.get(screenName);
        Integer value = screen.getTotalSeatsMap().get(type);
        screen.getTotalSeatsMap().put(type, value +1);
        screen.getSeatTypeMap().put(seatNumber, type);
    }
}
