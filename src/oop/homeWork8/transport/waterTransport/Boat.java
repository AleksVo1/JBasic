package oop.homeWork8.transport.waterTransport;

import oop.homeWork8.transport.Properties;

public class Boat extends WaterTransport implements Properties, Displacement {

    private final int length;
    private final int maxSpeed;
    private final int capacity;
    private final double displacement;

    public Boat(String start, String stop, int year, int length, int maxSpeed, int capacity, double displacement) {
        super(start, stop, year);
        this.length = length;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.displacement = displacement;
    }

    @Override
    public void start(){

    }

    @Override
    public void stop(){

    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    public int getLength() {

        return length;

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
    public double displacement() {

        return displacement;

    }
}
