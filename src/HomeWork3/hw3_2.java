package HomeWork3;/*
2. Розрахувати вартість товару
На вхід програми подається вартість товару за одиницю.
Програма запитує кількість товару, яку ви хочете придбати.
Програма має розрахувати загальну суму товару виходячи з наступних правил:
- якщо кількість товару більше 10, то знижка 5%
- якщо кількість товару більше 20, то знижка 10%
- якщо кількість товару більше 30, то знижка 12% + 0,4% за кожні додаткові 10 одиниць товару (перші 30 не враховуються)
(31шт - 12%, 41шт - 12,4%, 51 - 12,8% і т.д.)
- якщо кількість товару більше 80, знижка 13%
 */
import java.util.Scanner;

public class hw3_2 {
    public static void main(String[] args) {

        int costPerItem = Integer.parseInt(args[0]);
        double discount;

        System.out.println("Кількість товару яку ви хочете придбати: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 10 && number <= 20) {
            discount = 0.95; // знижка 5%
        }
            else if (number > 20 && number <= 30) {
            discount = 0.9; // знижка 10%
            }
            else if (number > 30 && number <= 40) {
            discount = 0.88; // знижка 12%
            }
            else if (number > 40 && number <= 50) {
                discount = 0.876; // знижка 12.4%
            }
            else if (number > 50 && number <= 60) {
                discount = 0.872; // знижка 12.8%
            }
            else if (number > 60 && number <= 70) {
                discount = 0.8868; // знижка 13.2%
            }
            else if (number > 70 && number <= 80) {
                discount = 0.864; // знижка 12.8%
            }
            else if (number > 80) {
                discount = 0.87; // знижка 13%
        }
        else {
            discount = 1;
        }
        System.out.println("Ціна товару: " + costPerItem * number * discount);
    }
}