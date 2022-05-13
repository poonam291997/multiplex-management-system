package com.example.demo.model;

public class Seat {

    Integer number;
    String sreenName;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSreenName() {
        return sreenName;
    }

    public void setSreenName(String sreenName) {
        this.sreenName = sreenName;
    }

    public Seat(Integer number) {
        this.number = number;
    }
}
