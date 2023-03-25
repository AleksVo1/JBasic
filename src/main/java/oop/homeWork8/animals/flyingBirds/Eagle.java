package main.java.oop.homeWork8.animals.flyingBirds;

public class Eagle extends FlyingBirds implements Speed {

    private final double neckLength;
    private final double speed;
    private double flyUp;
    private double flyDown;

    public Eagle(String color, int weight, double flightAltitude, double flightLength,
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

    public double getNeckLength() {

        return neckLength;
    }

    @Override
    public void flyDown() {

    }

    @Override
    public void flyUp() {

    }
}
