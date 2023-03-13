package javaBasic.homeWork3;
/* Розрахунок зарплатні.

На вхід програми подається номер місяця(1-12), вартість години та вісоток податку.
Розрахувати зарплатню за місяць з та без податку.
Враховувати, що:
будь-який місяць розпочинається з понеділка
2 останні дні тижня це вихідні
один робочий день це 8 годин.
*/

import java.util.Scanner;

public class Hw3_3 {
    public static void main(String[] args) {
        int January = Integer.parseInt(args[0]);
        int February = Integer.parseInt(args[1]);
        int March = Integer.parseInt(args[2]);
        int April = Integer.parseInt(args[3]);
        int May = Integer.parseInt(args[4]);
        int June = Integer.parseInt(args[5]);
        int July = Integer.parseInt(args[6]);
        int August = Integer.parseInt(args[7]);
        int September = Integer.parseInt(args[8]);
        int October = Integer.parseInt(args[9]);
        int November = Integer.parseInt(args[10]);
        int December = Integer.parseInt(args[11]);
        int costPerHour = Integer.parseInt(args[12]);
        double tax = Integer.parseInt(args[13]);

        int workingHoursPerDay = 8;
        int weeks = 4;
        int workingDaysInWeek = 5;
        int holidaysInWeek = 2;
        int costPerWorkingDayWithoutTax = workingHoursPerDay * costPerHour;
        double costPerWorkingDayWithTax = workingHoursPerDay * costPerHour * (tax/100+1);

        System.out.println("Введіть номер місяця від 1 до 12 ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == January ) {
            int days = 31;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Січень з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Січень з податком: " + costPerWorkingDayWithoutTax * workingDaysInMonth);

        }
        if (month == February) {
            int days = 28;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Лютй з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Лютй без податку: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == March) {
            int days = 31;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Март з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Март без податку: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == April) {
            int days = 30;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Квітень з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Квітень без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == May) {
            int daysMay = 31;
            int workingDaysInMonth = ((daysMay - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Май з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Май без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == June) {
            int daysJune = 30;
            int workingDaysInMonth = ((daysJune - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Червень з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Червень без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == July) {
            int days = 31;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Липень з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Липень без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == August) {
            int days = 31;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Серпень з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Серпень без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == September) {
            int days = 30;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Вересень з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Вересень без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == October) {
            int days = 31;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Жовтень з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Жовтень без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == November) {
            int days = 30;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Листопад з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Листопад без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        if (month == December) {
            int days = 31;
            int workingDaysInMonth = ((days - (weeks * workingDaysInWeek) - (weeks * holidaysInWeek))
            + (weeks * workingDaysInWeek));

            System.out.println("Зарплатня за Грудень з податком: " + costPerWorkingDayWithTax * workingDaysInMonth);
            System.out.println("Зарплатня за Грудень без податка: " + costPerWorkingDayWithoutTax * workingDaysInMonth);
        }
        else {
        }
    }
}


