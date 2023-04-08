package oop.homeWork8.transport;

public abstract class Transport {

    protected String start;
    protected String stop;

    public Transport(String start, String stop) {
        this.start = start;
        this.stop = stop;
    }

    public abstract void start();
    public abstract void stop();

}
