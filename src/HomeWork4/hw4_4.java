package HomeWork4;/*
Розрахунок зарплатні. (*Підвищенної складності, 10 балів)
На вхід програми подається вартість години та вісоток податку.
Вивести зарплатню за кожен місяць та за рік загалом з та без податку.
Враховувати, що:
- рік не високосний
- перший місяць розпочинається з понеділка
- 2 останні дні тижня це вихідні
- один робочий день це 8 годин.
Приклад повідомлення:

JAN 80 100
FEB 80 100
...
DEC XX YY
TOTAL: XX YY
 */

import java.util.Scanner;

public class hw4_4 {
    public static void main (String[] args){
     int costPerHour = Integer.parseInt(args[0]);
     double tax = Integer.parseInt(args[1]);
     int workingHoursPerDay = 8;
     int weeks = 4;
     int workingDaysInWeek = 5;
     int holidaysInWeek = 2;
     int year = 365;
     int costPerWorkingDayWithoutTax = workingHoursPerDay * costPerHour;
     double costPerWorkingDayWithTax = workingHoursPerDay * costPerHour * (tax/100+1);

     System.out.println("Введіть номер місяця від 1 до 12 ");
     Scanner sc = new Scanner(System.in);
     int months = sc.nextInt();
     int days;
     switch (months) {

        case 1:
            int JUN;


        case 2:
            int FEB;


    }
  }
}
