package oop.homeWork12;

public class Circle extends Figure {

    private final double radius;
    protected String name;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {

        return Math.PI * radius * 2;
    }

    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
