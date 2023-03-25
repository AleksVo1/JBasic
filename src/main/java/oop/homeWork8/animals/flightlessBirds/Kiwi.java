package main.java.oop.homeWork8.animals.flightlessBirds;

public class Kiwi extends FlightlessBirds implements WingLength{

    private final double wingLength;
    private final String beakColor;

    public Kiwi(String color, int weight, double height, String eyeColor, double wingLength,
                   String beakColor) {

        super(color, weight, height, eyeColor);
        this.wingLength = wingLength;
        this.beakColor = beakColor;
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

    public String getBeakColor() {

        return beakColor;
    }
}
