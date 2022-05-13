package com.example.demo.service;

import com.example.demo.dao.ScreenManagementDAO;
import com.example.demo.dao.ScreenManagementDAOImpl;
import com.example.demo.model.Filter;
import com.example.demo.model.Seat;
import com.example.demo.model.SeatType;

import java.util.List;
import java.util.Map;

public class BookingServiceImpl implements BookingService{

    FilterFactory factory;
    ScreenManagementDAO screenManagementDAO;

    public BookingServiceImpl() {
        screenManagementDAO = new ScreenManagementDAOImpl();
    }
    @Override
    public void checkAvailability(List<Filter> filters) {
        Map<SeatType, List<Integer>> map= screenManagementDAO.getSeats();
        for(Filter filter : filters) {
            // seats = filter.filter(seats);
        }
    }


}
