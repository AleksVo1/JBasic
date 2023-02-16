package HomeWork2;

/*
Розрахувати місячну і річну зарплатню з податками та без.
На вхід програми подається 3 числа: кількість робочих годин на тиждень, вартість години та вісоток податку.
Враховувати, що кожен місяць скаладається з 4 тижнів, в році 12 місяців.
Вивести в консоль за прикладом:
Зарплатня на місяць без податків: ххх
Зарплатня на місяць з податками: ххх
Зарплатня на рік без податків: ххх
Зарплатня на рік з податками: ххх
 */
public class hw2_2 {
    public static void main(String[] args){
        int hours = Integer.parseInt(args[0]);
        int cost = Integer.parseInt(args[1]);
        double tax = Integer.parseInt(args[2]);
        int weeks = 4;
        int months = 12;
        int salary = hours * cost * weeks;

        System.out.println(salary + " UAH salary per month");
        System.out.println(salary * (tax / 100 +1) + " UAH salary+tax per month");
        System.out.println(salary * months + " UAH salary per year");
        System.out.println(salary * months * (tax/100 + 1) +  " UAH salary+tax per year");
    }
}
