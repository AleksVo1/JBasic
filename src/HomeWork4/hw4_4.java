package homeWork4;

import java.util.Calendar;
/*
На вхід програми подається вартість години та відсоток податку.
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

public class hw4_4 {
    public static void main (String[] args){

        int hourlyCost = Integer.parseInt(args[0]);
        double taxPercentage = Integer.parseInt(args[1]);

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

        int workHoursInDay = 8;

        int totalSalaryWithoutTax = 0;
        int totalSalaryWithTax = 0;

        for (int i = 0; i < 12; i++) {
            int days = daysInMonth[i];

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.MONTH, i);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            int workDays = 0;
            for (int j = 1; j <= days; j++) {
                if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                    workDays++;
                }
                dayOfWeek = (dayOfWeek % 7) + 1;
            }

            int workHours = workDays * workHoursInDay;
            int salaryWithoutTax = workHours * hourlyCost;
            int salaryWithTax = (int) Math.round(salaryWithoutTax * (1 - taxPercentage/100));

            totalSalaryWithoutTax += salaryWithoutTax;
            totalSalaryWithTax += salaryWithTax;

            System.out.println(months[i] + " " + salaryWithoutTax + " " + salaryWithTax);
        }

        System.out.println("TOTAL: " + totalSalaryWithoutTax + " " + totalSalaryWithTax);
  }
}
