package oop.homeWork12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        ArrayList<Figure> figures = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String userAnswer;
        boolean isContinue = true;

        while (isContinue) {

            System.out.println("Яку фігуру відобразити: трикутник - 1, прямокутник - 2, коло - 3, паралелограм - 4," +
                                " ромб - 5, трапеція - 6, квадрат - 7?");
            int figure = sc.nextInt();

            if (figure == 1) {
                System.out.println("Яка перша сторона трикутника: ");
                double side1 = sc.nextInt();
                System.out.println("Яка друга сторона трикутника: ");
                double side2 = sc.nextInt();
                System.out.println("Яка третя сторона трикутника: ");
                double side3 = sc.nextInt();

                    Triangle triangle = new Triangle(side1, side2, side3);
                    triangle.setName("Triangle");
                    figures.add(triangle);

            }
                else if (figure == 2) {
                    System.out.println("Яка перша сторона прямокутника: ");
                    double side1 = sc.nextInt();
                    System.out.println("Яка друга сторона прямокутника: ");
                    double side2 = sc.nextInt();

                        Rectangle rectangle = new Rectangle(side1, side2, side1, side2);
                        rectangle.setName("Rectangle");
                        figures.add(rectangle);


                }
                else if (figure == 3) {
                    System.out.println("Який радіус кола: ");
                    double radius = sc.nextInt();

                        Circle circle = new Circle(radius);
                        circle.setName("Circle");
                        figures.add(circle);

                }
                else if (figure == 4) {
                    System.out.println("Яка перша сторона паралелограма: ");
                    double side1 = sc.nextInt();
                    System.out.println("Яка друга сторона паралелограма: ");
                    double side2 = sc.nextInt();
                    System.out.println("Яка висота паралелограма: ");
                    double height = sc.nextInt();

                        Parallelogram parallelogram = new Parallelogram(side1, side2, side1, side2, height);
                        parallelogram.setName("Parallelogram");
                        figures.add(parallelogram);

                }
                else if (figure == 5) {
                    System.out.println("Яка сторона ромба: ");
                    double side1 = sc.nextInt();
                    System.out.println("Який кут ромба: ");
                    double corner = sc.nextInt();
                    System.out.println("Яка діагональ ромба: ");
                    double diagonal = sc.nextInt();
                    System.out.println("Яка висота ромба: ");
                    double height = sc.nextInt();

                        Rhombus rhombus = new Rhombus(side1, side1, side1, side1, corner, diagonal, height);
                        rhombus.setName("Rhombus");
                        figures.add(rhombus);

                }

                else if (figure == 6) {
                    System.out.println("Яка перша сторона трапеції: ");
                    double side1 = sc.nextInt();
                    System.out.println("Яка друга сторона трапеції: ");
                    double side2 = sc.nextInt();
                    System.out.println("Яка третя сторона трапеції: ");
                    double side3 = sc.nextInt();
                    System.out.println("Яка четверта сторона трапеції: ");
                    double side4 = sc.nextInt();
                    System.out.println("Яка висота трапеції: ");
                    double height = sc.nextInt();

                        Trapeze trapeze = new Trapeze(side1, side2, side3, side4, height);
                        trapeze.setName("Trapeze");
                        figures.add(trapeze);

                }

                else if (figure == 7) {
                    System.out.println("Яка сторона квадрата: ");
                    double side = sc.nextInt();

                        Square square = new Square(side, side, side, side);
                        square.setName("Square");
                        figures.add(square);

                }

                else {
                System.out.println("Немає такої фігури.");

                }

            System.out.println("Якщо хочете додати ще одну фігуру, напишіть YES або NO");
            userAnswer = sc.next();
            isContinue = !userAnswer.equalsIgnoreCase("NO");
        }

            Collections.sort(figures, new sortFigures());

                    System.out.println("============= Figure list: ===============");

                int i = 1;
                for (Figure figure : figures) {

                    System.out.printf("%d. [%s]: Square = %.2f Perimeter = %.2f\n", i++, figure.getName(),
                            figure.getArea(), figure.getPerimeter());
                }
    }

    private static class sortFigures implements Comparator<Figure> {
        @Override
        public int compare(Figure figure1, Figure figure2) {
            double area1 = figure1.getArea();
            double area2 = figure2.getArea();

                if (area1 != area2) {
                    return Double.compare(area1, area2);
                } else {
                    double perimeter1 = figure1.getPerimeter();
                    double perimeter2 = figure2.getPerimeter();
                    return Double.compare(perimeter1, perimeter2);
                }
        }
    }
}
