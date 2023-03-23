package oop.homeWork12;

public class Triangle extends Figure {

    protected double side1;
    protected double side2;
    protected double side3;
    protected String name;

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

    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
