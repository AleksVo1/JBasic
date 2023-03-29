package oop.homeWork12;

public class Parallelogram extends Quadrangle {

    protected double height;
    protected String name;

    public Parallelogram(double side1, double side2, double side3, double side4, double height) {
        super(side1, side2, side3, side4);
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

    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
