package oop.homeWork8.transport.vehicles;

import oop.homeWork8.transport.Properties;

public class Tractor extends Vehicles implements Properties, Wheels {

    private final int weight;
    private final int maxSpeed;
    private final int capacity;
    private final int wheels;

    public Tractor(String start, String stop, int year, int weight, int maxSpeed, int capacity, int wheels) {

        super(start, stop, year);
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.wheels = wheels;
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

    public int getWeight() {

        return weight;

    }

    @Override
    public int qetMaxSpeed() {

        return maxSpeed;
    }

    @Override
    public int getCapacity() {

        return capacity;
    }

    @Override
    public int wheels() {

        return wheels;
    }
}
