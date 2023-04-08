package oop.homeWork8.transport.airTransport;

import oop.homeWork8.transport.Properties;

public class Balloon extends AirTransport implements Properties, Distance {

    private final double maxHeight;
    protected int maxSpeed;
    protected int capacity;
    protected double distance;

    public Balloon(String start, String stop, int seats, double maxHeight, int maxSpeed, int capacity, double distance) {
        super(start, stop, seats);
        this.maxHeight = maxHeight;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.distance = distance;
    }

    @Override
    public void start() {

        super.start();
    }

    @Override
    public void stop() {

        super.stop();
    }

    @Override
    public int getCapacity() {

        return capacity;
    }

    @Override
    public int qetMaxSpeed() {

        return maxSpeed;
    }

    @Override
    public double distance() {

        return distance;
    }

    public double getMaxHeight() {

        return maxHeight;
    }
}
