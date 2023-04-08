package oop.homeWork8.transport.waterTransport;


import oop.homeWork8.transport.Properties;

public class Barge extends WaterTransport implements Properties, Displacement {

    private final int width;
    private final int maxSpeed;
    private final int capacity;
    private final double displacement;

    public Barge(String start, String stop, int year, int width, int maxSpeed, int capacity, double displacement) {
        super(start, stop, year);
        this.width = width;
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

    public int getWidth() {

        return width;

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
