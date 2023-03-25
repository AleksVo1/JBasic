package main.java.oop.homeWork8.animals.flyingBirds;


import main.java.oop.homeWork8.animals.Animals;

public abstract class FlyingBirds extends Animals {

    protected double flightAltitude;
    protected double flightLength;

    public FlyingBirds(String color, int weight, double flightAltitude, double flightLength) {
        super(color, weight);
        this.flightAltitude = flightAltitude;
        this.flightLength = flightLength;
    }

    @Override
    public void color() {

    }

    @Override
    public void weight() {

    }

    public double getFlightAltitude() {

        return flightAltitude;
    }

    public double getFlightLength() {

        return flightLength;
    }

    public abstract void flyDown();

    public abstract void flyUp();
}
