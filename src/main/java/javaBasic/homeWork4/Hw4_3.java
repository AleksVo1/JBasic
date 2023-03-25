package main.java.javaBasic.homeWork4;/*
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

public class Hw4_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Який загальний розмір кредиту? ");
            int sumCredit = sc.nextInt();

        System.out.println("Який щомісячний відсоток на залишок по кредиту? ");
            double monthlyPercent = sc.nextInt();


        System.out.println("Оберіть варіант розрахунку:");
        System.out.println("Розрахувати кількість щомісячних платежів для повного погашення кредиту - ввести 1.");
        System.out.println("Розрахувати суму щомісячного платежу - ввести 2.");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Введіть суму щомісячного платежу.");
                double monthlyPayment = sc.nextDouble();
                int numPayments = (int) Math.ceil(-(Math.log(1 - monthlyPercent/100/12 * sumCredit / monthlyPayment) /
                        Math.log(1 + monthlyPercent/100/12)));
                System.out.println("Кількість щомісячних платежів для повного погашення кредиту: " + numPayments);

            }
            else if (choice == 2){
                System.out.println("Введіть кількість платежів: ");
                int numPayments = sc.nextInt();

                double monthlyPayment = (sumCredit * monthlyPercent/100/12) /
                        (1 - Math.pow(1 + monthlyPercent/100/12, -numPayments));
                System.out.println("Сума щомісячного платежу становить: " + monthlyPayment);
            }
            else {
                System.out.println("Ви ввели некоректний варіант, спробуйте ще раз.");
            }
    }
}

// одна формула которая повторяется пока на остатке не будет ноль
// x + x*tax and