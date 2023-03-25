package main.java.oop.homeWork8.transport.airTransport;

import main.java.oop.homeWork8.transport.Properties;

public class Plane extends AirTransport implements Properties, Distance {

    private final double wingLength;
    protected int maxSpeed;
    protected int capacity;
    protected double distance;

    public Plane(String start, String stop, int seats, double wingLength, int maxSpeed, int capacity, double distance) {

        super(start, stop, seats);
        this.wingLength = wingLength;
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

    public double getWingLength() {

        return wingLength;
    }
}
