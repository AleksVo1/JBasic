package main.java.oop.homeWork8.animals.pets;

public class Hamster extends Pets implements Length{

    private final int birthDay;
    private final double length;

    public Hamster(String color, String weight, double height, int birthDay, double length) {
        super(color, weight, height);
        this.birthDay = birthDay;
        this.length = length;
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

    public int getBirthDay() {

        return birthDay;
    }

    @Override
    public double length() {

        return length;
    }
}
