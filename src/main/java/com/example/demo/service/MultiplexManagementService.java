package com.example.demo.service;

import com.example.demo.model.Multiplex;

public interface MultiplexManagementService {

    //  multiplex name is unique
    void addMultiplex(String multiplexName, String location);
    Multiplex getMultiplexByName(String name);
}
