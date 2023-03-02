package oop.homeWork8.animals.flyingBirds;

public class Stork extends FlyingBirds implements Speed{

    private final double speed;
    private final int neckLength;

    public Stork(String color, int weight, double flightAltitude, double flightLength,
                double speed, int neckLength) {

        super(color, weight, flightAltitude, flightLength);
        this.speed = speed;
        this.neckLength = neckLength;
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
}
