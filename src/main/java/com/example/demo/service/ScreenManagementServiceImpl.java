package com.example.demo.service;

import com.example.demo.dao.ScreenManagementDAO;
import com.example.demo.dao.ScreenManagementDAOImpl;
import com.example.demo.model.SeatType;

public class ScreenManagementServiceImpl implements ScreenManagementService {

    private MultiplexManagementService multiplexManagementService;
    private ScreenManagementDAO screenManagementDAO;

    public ScreenManagementServiceImpl() {
        multiplexManagementService = new MultiplexManagementServiceImpl();
        screenManagementDAO = new ScreenManagementDAOImpl();
    }
    @Override
    public void addScreen(String name, String multiplexName) {
        validate(name, multiplexName);
        screenManagementDAO.addScreen(name, multiplexName);
    }

    @Override
    public void addSeat(Integer seatNumber, SeatType type, String screenName, String multiplexName) {
        screenManagementDAO.addSeat(seatNumber, type, screenName, multiplexName);
    }

    private void validate(String name, String multiplexName) {
        if(multiplexManagementService.getMultiplexByName(name) != null) {
            throw new RuntimeException("Invalid input");
        }
    }
}
