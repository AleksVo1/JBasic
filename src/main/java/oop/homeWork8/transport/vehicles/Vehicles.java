package oop.homeWork8.transport.vehicles;

import oop.homeWork8.transport.Transport;

public abstract class Vehicles extends Transport {

    public int year;

    public Vehicles(String start, String stop, int year) {

        super(start, stop);
        this.year = year;
    }

    @Override
    public abstract void start();
    @Override
    public abstract void stop();

    public abstract void year();

}
