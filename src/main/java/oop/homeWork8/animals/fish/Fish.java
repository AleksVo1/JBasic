package main.java.oop.homeWork8.animals.fish;

import main.java.oop.homeWork8.animals.Animals;

public abstract class Fish extends Animals {

    protected int divingDepth;

    public Fish(String color, String weight, int divingDepth) {
        super(color, Integer.parseInt(weight));
        this.divingDepth = divingDepth;
    }

    @Override
    public void color() {

    }

    @Override
    public void weight() {

    }

    public int getDivingDepth() {

        return divingDepth;
    }
}
