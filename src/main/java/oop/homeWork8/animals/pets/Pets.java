package main.java.oop.homeWork8.animals.pets;


import main.java.oop.homeWork8.animals.Animals;

public abstract class Pets extends Animals {

    protected double height;

    public Pets(String color, String weight, double height) {
        super(color, Integer.parseInt(weight));
        this.height = height;
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
}
