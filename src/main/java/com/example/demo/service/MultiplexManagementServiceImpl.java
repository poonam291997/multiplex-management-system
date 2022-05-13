package com.example.demo.service;

import com.example.demo.dao.MultiplexManagementDAO;
import com.example.demo.dao.MultiplexManagementDAOImpl;
import com.example.demo.model.Multiplex;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MultiplexManagementServiceImpl implements MultiplexManagementService {

    private MultiplexManagementDAO multiplexManagementDAO;

    public MultiplexManagementServiceImpl() {
        multiplexManagementDAO = new MultiplexManagementDAOImpl();
    }
    @Override
    public void addMultiplex(String multiplexName, String location) {
        validateIfMultiplexExists(multiplexName, location);
        multiplexManagementDAO.addMultiplex(multiplexName, location);
    }

    @Override
    public Multiplex getMultiplexByName(String name) {
        Optional<Multiplex> multiplex = multiplexManagementDAO.getMultiplexes().stream().filter(m-> m.getName().equals(name)).findFirst();
        return multiplex.orElse(null);
    }

    private void validateIfMultiplexExists(String multiplexName, String location) {
        List<Multiplex> multiplexes = multiplexManagementDAO.getMultiplexes();
        multiplexes = multiplexes.stream().filter(m -> m.getName().equals(multiplexName))
                .collect(Collectors.toList());
        if(multiplexes.size() != 0) {
            throw new RuntimeException("Not a unique input combination");
        }
    }
}
