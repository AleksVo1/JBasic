package oop.homeWork8.animals.flyingBirds;


import oop.homeWork8.Fly;

public class Stork extends FlyingBirds implements Speed, Fly {

    private final double speed;
    private final int neckLength;
    private final double flyUp;
    private final double flyDown;

    public Stork(String color, int weight, double flightAltitude, double flightLength,
                double speed, int neckLength, double flyUp, double flyDown) {

        super(color, weight, flightAltitude, flightLength);
        this.speed = speed;
        this.neckLength = neckLength;
        this.flyUp = flyUp;
        this.flyDown = flyDown;
    }

    @Override
    public void color() {

        super.color();
    }

    @Override
    public void weight() {

        super.weight();
    }

    @Override
    public double getFlightAltitude() {

        return super.getFlightAltitude();
    }

    @Override
    public double getFlightLength() {

        return super.getFlightLength();
    }

    @Override
    public double speed() {

        return speed;
    }

    public int getHeadColor() {

        return neckLength;
    }

    @Override
    public void flyDown() {

    }

    @Override
    public void flyUp() {

    }
}
