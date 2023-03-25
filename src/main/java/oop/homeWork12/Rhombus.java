package main.java.oop.homeWork12;

public class Rhombus extends Quadrangle {

    protected double height;
    protected double corner;
    protected double diagonal;
    protected String name;

    public Rhombus(double side1, double side2, double side3, double side4, double height,
                   double corner, double diagonal) {
        super(side1, side2, side3, side4);
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

    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
