package javaBasic.homeWork2;

import java.util.Scanner;
/*
Розрахувати вартість години.
Програма по черзі запитує 3 числа: кількість робочих годин на тиждень, річна зарплатня з податками та вісоток податку.
Розрахувати вартість години часу без податку.
Враховувати, що кожен місяць скаладається з 4 тижнів, в році 12 місяців.
Вивести результат в консоль за прикладом:
При ххх робочих годин на тиждень з річною зарплатею в ххх та податком хх%
година часу коштує ххх
 */
public class Hw2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Кількість робочих годин на тиждень:");

        int hours = sc.nextInt();
        System.out.println("Річна зарплатня з податками:");

        int salary = sc.nextInt();
        System.out.println("Відсоток податка на звробітнк плату:");

        double tax = sc.nextInt();
        int weeks = 4;
        int months = 12;
        System.out.println("Година часу коштує: " + salary * (tax/100 + 1) / months / weeks / hours);
    }
}
