package javaBasic.homeWork2;

/*
На вхід програми подається 2 числа.
Вивести в консоль результат піднесення першого числа в степінь другого числа.
 */
public class Hw2_1 {
    public static void main(String[] args){

        int number = Integer.parseInt(args[0]);
        int degree = Integer.parseInt(args[1]);
        System.out.println(Math.pow(number,degree));
    }
}
