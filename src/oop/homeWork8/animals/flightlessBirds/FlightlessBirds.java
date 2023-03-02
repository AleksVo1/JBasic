package oop.homeWork8.animals.flightlessBirds;

import oop.homeWork8.animals.Animals;

public abstract class FlightlessBirds extends Animals {

    protected double height;
    protected String eyeColor;

    public FlightlessBirds(String color, int weight, double height, String eyeColor) {

        super(color, weight);
        this.height = height;
        this.eyeColor = eyeColor;
    }

    @Override
    public void color() {

    }

    @Override
    public void weight() {

    }

    public double getHeight() {

        return height;
    }

    public String getEyeColor() {

        return eyeColor;
    }
}
