package oop.homework7;

public class RightTriangle extends Triangle{

    public RightTriangle(double side1, double side2) {

        super(side1, side2, Math.sqrt(side1 * side1 + side2 * side2));
    }

    @Override
    public double getArea(){

        return 0.5 * side1 * side2;
    }

    @Override
    public double getPerimeter(){

        return 2 * side1 * side2;
    }
}
