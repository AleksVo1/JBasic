package main.java.oop.homeWork8.animals.pets;

public class Dog extends Pets implements Length {

    private final String name;
    private final double length;

    public Dog(String color, String weight, double height, String name, double length) {

        super(color, weight, height);
        this.name = name;
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

    public String getName() {

        return name;
    }

    @Override
    public double length() {

        return length;
    }


}
