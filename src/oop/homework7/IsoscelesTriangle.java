package oop.homework7;

public class IsoscelesTriangle extends Triangle{

    protected double height;

    public IsoscelesTriangle(double side1, double side2, double side3, double height) {

        super(side1, side2, side3);
        this.height = height;
    }

    @Override
    public double getPerimeter() {

        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {

        height = Math.sqrt(Math.pow(side1, 2) - (Math.pow(side3, 2) / 4));

        return side3 * height / 2;
    }
}
