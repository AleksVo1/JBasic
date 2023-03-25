package main.java.oop.homework7;

public class Trapeze extends Quadrangle{

    protected double height;

    public Trapeze(double side1, double side2, double side3, double side4, double height) {

        super(side1, side2, side3, side4);
        this.height = height;
    }

    @Override
    public double getPerimeter() {

        return side1 + side2 + side3 + side4;
    }

    @Override
    public double getArea() {

        height = Math.sqrt(Math.pow(side1, 2) - Math.pow((side4 - side2), 2) / 4);

        return (side1 + side2) * height / 2 ;
    }
}
