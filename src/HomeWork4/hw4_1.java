package homeWork4;
/*
Програма запитує користувача, яку з фігур намалювати.
В залежності від фігури програма запитує аргументи для фігури.
Вивести фігури за прикладом:
- прямокутник (аргументи: висота і ширина)/
*********
*********
*********
*********

- прямокутний трикутник (аргумент: висота) (прямий кут зліва внизу)
*
**
***
****
*****

- зворотній прямокутний трикутник (аргумент: висота) (прямий кут зправа внизу)
    *
   **
  ***
 ****
*****

- трикутник (аргументи: висота)

    *
   ***
  *****
 *******
*********

Після виводу фігури програма має запитати чи хоче користувач вивести ще одну фігуру.
У випадку 'yes' програма знову запитує яку саме фігуру і т.д.
У випадку 'no' програма завершує свою роботу.
(Програма не має завершитись поки користувач не введе 'no')
 */

import java.util.Scanner;

public class hw4_1 {

    public static void main (String[] args) {

            String userAnswer;
            boolean isContinue = true;

            while (isContinue) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Яку фігуру відобразити? трикутник - ввести 1 , прямокутник - ввести 2: ");

                int figure = sc.nextInt();

                if (figure == 2) {
                    System.out.println("Яка висота фігури: ");
                    int height = sc.nextInt();
                    System.out.println("Яка ширина фігури: ");
                    int width = sc.nextInt();

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                }

                if (figure == 1) {
                    System.out.println("Який трикутник вивести? Прямий кут зліва - написати 1, " +
                            "прямий кут справа - написати 2, рівносторонній трикутник - написати 3.");
                    int triangle = sc.nextInt();

                    System.out.println("Яка висота фігури: ");
                    int height = sc.nextInt();

                    switch (triangle) {

                        case 1:
                            for (int i = 0; i <= height; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;

                        case 2:
                            for (int i = 0; i <= height; i++) {
                                for (int j = 0; j < height - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = i; j > 0; j--) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;

                        case 3:
                            for (int i = 0; i <= height; i++) {
                                for (int j = 0; j < height - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j = i; j > 0; j--) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Немає такою фігури.");
                    }
                }

                System.out.println("Чи хочете вивести ще одну фігуру, напішіть YES або NO");
                userAnswer = sc.next();

                    isContinue = !userAnswer.equals("NO");
        }
    }
}

