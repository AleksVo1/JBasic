package oop.homeWork8.animals.flightlessBirds;

public class Penguin extends FlightlessBirds implements WingLength{

    private final double wingLength;
    private final String featherColor;

    public Penguin(String color, int weight, double height, String eyeColor, double wingLength,
                   String featherColor) {

        super(color, weight, height, eyeColor);
        this.wingLength = wingLength;
        this.featherColor = featherColor;
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
    public double getHeight() {

        return super.getHeight();
    }

    @Override
    public String getEyeColor() {

        return super.getEyeColor();
    }

    @Override
    public double wingLength() {

        return wingLength;
    }

    public String getFeatherColor() {

        return featherColor;
    }
}
