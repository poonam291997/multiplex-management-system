package com.example.demo.model;

import java.util.Collections;
import java.util.Set;

public class Multiplex {

    private String name;
    private String location;
    Set<Screen> screens;

    public Multiplex(String name, String location) {
        this.name = name;
        this.location = location;
        this.screens = Collections.emptySet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Screen> getScreens() {
        return screens;
    }

    public void setScreens(Set<Screen> screens) {
        this.screens = screens;
    }
}
