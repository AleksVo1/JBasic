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

            if(discriminant > 0){
                   double x1 = (- b - Math.sqrt(discriminant)) / (2 * a);
                   double x2 = (- b + Math.sqrt(discriminant)) / (2 * a);

                        System.out.println("Корені рівняння: х1 = " + x1 + ", x2 = " + x2);

            }
                else if (discriminant == 0) {
                        double x = - b / (2 * a);

                            System.out.println("Рівняння має єдиний корінь: х = " + x);

                }

                    else {
                        System.out.println("Рівняння не має дійсних коренів");

                    }
    }
}
