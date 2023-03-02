package oop.homeWork8.animals;

public abstract class Animals {

    protected String color;
    protected int weight;

    public Animals(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public abstract void color();
    public abstract void weight();

}
