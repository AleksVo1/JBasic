package HomeWork4;/*
2. Сортування масиву (30 балів)
На віхд програми подається довільний набір чисел
Програма має вивести:

- початковий масив

- сортований від найменшого до найбільшого

- сортований від найбільшого до найменшого

- сортований від країв найбільші в середині найменші

Приклад:
base 8, 1, 2, 5, 7, 12, 3
asc  1, 2, 3, 5, 7, 8, 12
desc 12, 8, 7, 5, 3, 2, 1
inner 12, 7, 3, 1, 2, 5, 8
 */

import java.util.Arrays;
import java.lang.String;
import java.util.Collections;

public class hw4_2 {

    public static void main (String [] args) {
// Basic
        int [] array = {8, 1, 2, 5, 7, 12, 3};
        System.out.println("Basic sorting:");

            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i]);
            }
// ascending sorting
        System.out.println("\nAscending sorting: ");
                Arrays.sort(array);

            for (int num : array) {
                System.out.print(num + " ");
            }

// descending sorting
        Integer [] numbers1 = {8, 1, 2, 5, 7, 12, 3};
        System.out.println("\nDescending sorting: ");
            Arrays.sort(numbers1, Collections.reverseOrder());

        for (int num : numbers1) {
            System.out.print(num + " ");
        }
// inner sorting






    }
}
