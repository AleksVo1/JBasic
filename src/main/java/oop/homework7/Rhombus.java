package main.java.oop.homework7;

public class Rhombus extends Quadrangle {

    protected double height;
    protected double corner;
    protected double diagonal;

    public Rhombus(double side1, double height, double corner, double diagonal) {

        super (side1, side1, side1, side1);
        this.height = height;
        this.corner = corner;
        this.diagonal = diagonal;

    }

    @Override
    public double getPerimeter(){

        return side1 * 4;
    }

    @Override
    public double getArea(){

        height = Math.sqrt(Math.pow(side1, 2) - Math.pow(diagonal/2, 2));

        return side1 * height;
    }
}
