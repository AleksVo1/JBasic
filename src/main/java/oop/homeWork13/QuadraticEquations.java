package oop.homeWork13;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ведіть коефіцієнт а квадратного рівняння?");
            double a = sc.nextInt();

        System.out.println("Ведіть коефіцієнт в квадратного рівняння?");
            double b = sc.nextInt();

        System.out.println("Ведіть коефіцієнт с квадратного рівняння?");
            double c = sc.nextInt();

                double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {

            PositiveDiscriminant positiveDiscriminant = new PositiveDiscriminant(a, b, c);

                System.out.println("Корені рівняння: х1 = " + positiveDiscriminant.getX1() +
                        ", x2 = " + positiveDiscriminant.getX2());
        }
            else if (discriminant == 0) {
                ZeroDiscriminant zeroDiscriminant = new ZeroDiscriminant(a, b);

                    System.out.println("Рівняння має єдиний корінь: х = " + zeroDiscriminant.getX());

            }
                else {
                    System.out.println("Рівняння не має дійсних коренів");
                }
    }

    public static class PositiveDiscriminant {
        double a;
        double b;
        double c;
        double discriminant;
        double x1;
        double x2;

        public PositiveDiscriminant(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.discriminant = Math.pow(b, 2) - 4 * a * c;
            this.x1 = (- b - Math.sqrt(discriminant)) / (2 * a);
            this.x2 = (- b + Math.sqrt(discriminant)) / (2 * a);
        }

                public double getX1() {
                    return x1;
                }

                public double getX2() {
                    return x2;
                }
    }

    public static class ZeroDiscriminant {
        double a;
        double b;
        double x;

        public ZeroDiscriminant(double a, double b) {
            this.a = a;
            this.b = b;
            this.x = - b / (2 * a);
        }

        public double getX() {
                return x;
            }
    }
}
