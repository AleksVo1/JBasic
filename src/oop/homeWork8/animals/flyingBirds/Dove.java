package oop.homeWork8.animals.flyingBirds;

import oop.homeWork8.Fly;

public class Dove extends FlyingBirds implements Speed, Fly {

    private final double speed;
    private final String headColor;
    private double flyUp;
    private double flyDown;


    public Dove(String color, int weight, double flightAltitude, double flightLength, double speed,
                String headColor, double flyUp, double flyDown) {
        super(color, weight, flightAltitude, flightLength);
        this.speed = speed;
        this.headColor = headColor;
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

    public String getHeadColor() {

        return headColor;
    }

    @Override
    public void flyUp() {

    }

    @Override
    public void flyDown() {

    }
}
