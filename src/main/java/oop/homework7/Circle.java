package main.java.oop.homework7;

public class Circle extends Figure {

    private final double radius;

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


}
