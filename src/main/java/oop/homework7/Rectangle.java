package main.java.oop.homework7;

public class Rectangle extends Quadrangle{

    public Rectangle(double side1, double side2) {

        super(side1, side1, side2, side2);
    }

    @Override
    public double getPerimeter() {

        return 2 * side1 + 2 * side2;
    }

    @Override
    public double getArea() {

        return side1 * side2;
    }
}
