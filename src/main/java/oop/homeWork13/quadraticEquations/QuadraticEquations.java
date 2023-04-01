package oop.homeWork13.quadraticEquations;

public class QuadraticEquations {

    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Root getRoots() {
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new Root(x1, x2);

        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return new Root(x);

        } else {
            return new Root();
        }
    }
}
