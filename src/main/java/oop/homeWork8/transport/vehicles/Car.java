package main.java.oop.homeWork8.transport.vehicles;

import main.java.oop.homeWork8.transport.Properties;

public class Car extends Vehicles implements Properties, Wheels {

    private final int maxSpeed;
    private final int capacity;
    private final String model;
    private final int wheels;

    public Car(String start, String stop, int year, int capacity, int maxSpeed, String model, int wheels) {

        super(start, stop, year);
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.wheels = wheels;

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void year() {

    }

    @Override
    public int qetMaxSpeed() {

        return maxSpeed;
    }

    @Override
    public int getCapacity() {

        return capacity;
    }

    public String getModel() {

        return model;
    }

    @Override
    public int wheels() {

        return wheels;
    }
}
