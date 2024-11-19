package com.example.openshift.demo;

public class FlightInfo {
    private int id;
    private String flightNumber;
    private String flightName;

    public FlightInfo(int id, String flightNumber, String flightName) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.flightName = flightName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
}
