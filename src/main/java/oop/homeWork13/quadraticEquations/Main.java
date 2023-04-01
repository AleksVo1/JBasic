package oop.homeWork13.quadraticEquations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ведіть коефіцієнт а квадратного рівняння?");
            double a = sc.nextInt();

            System.out.println("Ведіть коефіцієнт в квадратного рівняння?");
            double b = sc.nextInt();

            System.out.println("Ведіть коефіцієнт с квадратного рівняння?");
            double c = sc.nextInt();

            QuadraticEquations quadraticEquations = new QuadraticEquations(a, b, c);

            Root root = quadraticEquations.getRoots();

            System.out.println(root.toString());
        }
        catch (InputMismatchException e){
            System.err.println("Ви повинні ввести числа.");
        }
    }
}
