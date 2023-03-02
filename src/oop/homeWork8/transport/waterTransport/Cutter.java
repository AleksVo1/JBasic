package oop.homeWork8.transport.waterTransport;

import oop.homeWork8.transport.Properties;

public class Cutter extends WaterTransport implements Properties, Displacement {

    private final int weight;
    private final int maxSpeed;
    private final int capacity;
    private final double displacement;

    public Cutter(String start, String stop, int year, int weight, int maxSpeed, int capacity, double displacement) {
        super(start, stop, year);
        this.weight = weight;
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
    public double displacement() {

        return displacement;

    }
}
