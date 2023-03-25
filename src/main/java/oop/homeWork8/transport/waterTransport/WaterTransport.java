package main.java.oop.homeWork8.transport.waterTransport;


import main.java.oop.homeWork8.transport.Transport;

public abstract class WaterTransport extends Transport {

    protected int year;

    public WaterTransport(String start, String stop, int year) {
        super(start, stop);
        this.year = year;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    public int getYear() {

        return year;
    }

}
