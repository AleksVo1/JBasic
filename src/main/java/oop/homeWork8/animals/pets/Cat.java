package oop.homeWork8.animals.pets;

public class Cat extends Pets implements Length {

    private final String breed;
    private final double length;

    public Cat(String color, String weight, double height, String breed, double length) {

        super(color, weight, height);
        this.breed = breed;
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

    public String getBreed() {

        return breed;
    }

    @Override
    public double length() {

        return length;
    }
}
