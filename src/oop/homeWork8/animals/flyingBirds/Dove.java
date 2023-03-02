package oop.homeWork8.animals.flyingBirds;

public class Dove extends FlyingBirds implements Speed{

    private final double speed;
    private final String headColor;

    public Dove(String color, int weight, double flightAltitude, double flightLength,
                double speed, String headColor) {

        super(color, weight, flightAltitude, flightLength);
        this.speed = speed;
        this.headColor = headColor;
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

    public String getHeadColor() {

        return headColor;
    }
}
