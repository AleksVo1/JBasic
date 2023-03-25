package main.java.oop.homework7;

public class Triangle extends Figure {

    protected final double side1;
    protected final double side2;
    protected final double side3;

    public Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter(){

        return side1 + side2 + side3;
    }

    @Override
    public double getArea(){

        double semiPerimeter = getPerimeter()/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2)
                * (semiPerimeter - side3));
    }
}
