package oop.homeWork12;

public class Rectangle extends Quadrangle {

    protected String name;

    public Rectangle(double side1, double side2, double side3, double side4) {
        super(side1, side2, side3, side4);
    }

    @Override
    public double getPerimeter() {

        return 2 * side1 + 2 * side2;
    }

    @Override
    public double getArea() {

        return side1 * side2;
    }

    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
