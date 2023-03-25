package main.java.oop.homeWork12;

public class Quadrangle extends Figure {

    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;

    public Quadrangle(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public double getPerimeter() {

        return side1 + side2 + side3 + side4;
    }

    @Override
    public double getArea(){

        double semiPerimeter = (side1 + side2 + side3 + side4)/2;
        double cornerA = 0;
        double cornerB = 0;

        return Math.sqrt((semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3)
                * (semiPerimeter - side4) - side1 * side2 * side3 * side4 * Math.cos(2)
                * ((cornerA + cornerB) / 2) / 4);
    }

    @Override
    public String getName() {
        return null;
    }

}
