package javaBasic.homeWork3;/*
Програма запитує у корисутвача число.
Результатом програми має бути інформація про число:

парне/непарне
додатнє/від'ємне
просте/складене
 */

import java.util.Scanner;

public class Hw3_1 {
    public static void main (String[] args){
        int number;
        int number2;
        boolean check = true;
        System.out.print("Ввести число: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
// парне/непарне
            if (number % 2 == 0) {
                System.out.println(number + " - Парне число");
            }
            else {
                System.out.println(number + " - Непарне число");
            }

// додатнє/від'ємне
            if (number > 0) {
                System.out.println(number + " - Додатнє число");
            }
            else {
                System.out.println(number + " - Від'ємне число");
            }
// просте/складне число
            for (int i = 2; i <= number/2; i++) {
            number2 = number % i;

                if (number2 == 0) {
                check = false;
                break;
                }
            }
                if (check) {
                System.out.println(number + " - просте число");
                }
            else {
                System.out.println(number + " - складне число");
                }

    }
}
