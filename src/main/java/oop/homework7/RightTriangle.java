package main.java.oop.homework7;

public class RightTriangle extends Triangle{

    public RightTriangle(double side1, double side2, double side3) {

        super(side1, side2, side3);
    }

    @Override
    public double getArea(){

        return 0.5 * side1 * side2;
    }

    @Override
    public double getPerimeter(){

        return side1 + side1 + side2;
    }
}
