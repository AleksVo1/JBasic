package oop.homeWork8.transport.vehicles;

import oop.homeWork8.transport.Properties;

public class Bus extends Vehicles implements Properties {

    private final int seats;
    private final int maxSpeed;
    private final int capacity;

    public Bus(String start, String stop, int year, int seats, int maxSpeed, int capacity) {
        super(start, stop, year);
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    @Override
    public void start(){

    }

    @Override
    public void stop(){

    }

    @Override
    public void year(){

    }

    public int getSeats() {

        return seats;

    }

    @Override
    public int qetMaxSpeed() {

        return maxSpeed;
    }

    @Override
    public int getCapacity() {

        return capacity;
    }
}
