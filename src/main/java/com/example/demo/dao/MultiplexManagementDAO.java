package com.example.demo.dao;

import com.example.demo.model.Multiplex;
import com.example.demo.model.Screen;

import java.util.ArrayList;
import java.util.List;

public interface MultiplexManagementDAO {
        void addMultiplex(String name, String location);
        List<Multiplex> getMultiplexes();
        void addScreen(Screen screen, String name);
}
