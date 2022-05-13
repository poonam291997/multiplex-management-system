package com.example.demo.dao;

import com.example.demo.model.Multiplex;
import com.example.demo.model.Screen;

import java.util.ArrayList;
import java.util.List;

public class MultiplexManagementDAOImpl implements MultiplexManagementDAO {

    private List<Multiplex> multiplexList = new ArrayList<>();

    @Override
    public synchronized void addMultiplex(String name, String location) {
        try {
            multiplexList.add(new Multiplex(name, location));
        } catch (Exception e) {
            throw  new RuntimeException("Failed to add Multiplex, exception is :", e);
        }
    }

    @Override
    public List<Multiplex> getMultiplexes() {
        return multiplexList;
    }

    @Override
    public void addScreen(Screen screen, String name) {
        for(Multiplex multiplex: multiplexList) {
            if(multiplex.getName().equals(name)) {
                multiplex.getScreens().add(screen);
                break;
            }
        }
    }

}
