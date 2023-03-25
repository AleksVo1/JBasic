package main.java.oop.homeWork8.transport.airTransport;

import main.java.oop.homeWork8.transport.Transport;

public abstract class AirTransport extends Transport {

    protected int seats;

    public AirTransport(String start, String stop, int seats) {

        super(start, stop);
        this.seats = seats;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    public int getSeats() {
        return seats;
    }
}
