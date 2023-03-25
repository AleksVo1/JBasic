package main.java.oop.homeWork12;

public abstract class Figure{
    protected String name;

    public abstract double getPerimeter();
    public abstract double getArea();

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}
