package oop.homework7;

public class Square extends Quadrangle{

    public Square(double side1) {

        super (side1, side1, side1, side1);
    }

    @Override
    public double getPerimeter() {

        return side1 * 4;
    }

    @Override
    public double getArea() {
        return side1 * side1;
    }
}
