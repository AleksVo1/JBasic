package main.java.oop.homeWork12;

public class Square extends Quadrangle {

    protected String name;

    public Square(double side1, double side2, double side3, double side4) {
        super(side1, side2, side3, side4);
    }

    @Override
    public double getPerimeter() {

        return side1 * 4;
    }

    @Override
    public double getArea() {

        return side1 * side1;
    }

    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
