package main.java.oop.homeWork8.animals.flightlessBirds;

public class Duck extends FlightlessBirds implements WingLength{

    private final double wingLength;
    private final int featherCount;

    public Duck(String color, int weight, double height, String eyeColor, double wingLength,
                   int featherCount) {

        super(color, weight, height, eyeColor);
        this.wingLength = wingLength;
        this.featherCount = featherCount;
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

    public int getFeatherCount() {

        return featherCount;
    }
}
