package HomeWork4;/*
3. Розстрочка

Програма запитує користувача загальну суму кредиту та місячний
відсоток на залишок по кредиту.
Програма просить користувача обрати один з двух варіантів:
- Розрахувати кількість щомісячних платежів, які необхідно зробити для повного
погашення кредиту (програма просить суму щомісячного взносу)
- Розрахувати суму щомісячного платежу (програма просить кількість платежів)
Врахувати, що кожен місяць до залишку по кредиту додається місячний відсоток.
Приклад:
сума кредиту 100, місячна ставка 1%. Якщо користувач сплатив 10 в перщому місяці,
то в другому місяці залишок кредиту буде складати 90+0.9
 */

import java.util.Scanner;

public class hw4_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Який загальний розмір кредиту? ");
            int sumCredit = sc.nextInt();

        System.out.println("Який щомісячний відсоток на залишок по кредиту? ");
            double monthlyPercent = sc.nextInt();

        System.out.println("Який твій перший внесок? ");
            int firstPayment = sc.nextInt();

        System.out.println("Який строк кредиту в місяцях? ");
            int months = sc.nextInt();

        System.out.println("Розрахувати суму щомісячного платежу - ввести 1. Розрахувати кількість " +
             "щомісячних платежів - ввести 2. ");
            double choice = sc.nextInt();

            double loanCredit = sumCredit - firstPayment;
            double monthlyPayment = (firstPayment  + loanCredit * monthlyPercent/100);
            double numberPayments = (loanCredit / monthlyPayment);

            if (choice == 1) {
                System.out.println("Щомісячний платіж складвє: " + monthlyPayment);
            }
            if (choice == 2){
                System.out.println("Ваш кредит буде погашен якщо ви зробите " + numberPayments + " платіж(ів)");
            }
    }
}

// одна формула которая повторяется пока на остатке не будет ноль
// x + x*tax and