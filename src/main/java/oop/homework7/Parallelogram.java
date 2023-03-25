package main.java.oop.homework7;

public class Parallelogram extends Quadrangle{

    protected double height;

    public Parallelogram(double side1, double side2, double height) {

        super(side1, side1, side2, side2);
        this.height = height;
    }

    @Override
    public double getPerimeter(){

        return (side1 + side2) * 2;
    }

    @Override
    public double getArea(){

        height = Math.sqrt(Math.pow(side1, 2) - Math.pow(side2/2, 2));

        return side1 * height;
    }
}
