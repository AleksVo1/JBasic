package oop.homework7;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side1) {

        super(side1, side1, side1);
    }

    @Override
    public double getPerimeter() {

        return side1 * 3;
    }

    @Override
    public double getArea(){

        return Math.sqrt(3) / 4 * Math.pow(side1, 2);
    }
}
