package ua.od.pindus;

import java.util.Scanner;

/**
 * Найти сумму первых n элементов массива
 */
public class SumOfN {
    public static void main(String[] args) {
        int n, sum = 0;
        int[] a = {2, 58, -8, 7, 78, 2, -85, 55, 40, 87, 50, -68, -1, 88, 4};

        System.out.println("Enter n: (n<=15)");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //5. Найти сумму первых n элементов массива
        if (n <= 0 || n > a.length)
            System.out.println("Incorrect input");
        else {
            for (int i = 0; i < n; i++)
                sum += a[i];
            System.out.println("Sum of first " + n + " elements is " + sum);
        }

        //6. Найти минимальный и максимальный элемент массива
        int min, max;
        min = a[0];
        max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Minimum element is " + min);
        System.out.println("Maximum element is " + max);

        //7. Найти сумму всех четных и сумму всех нечетных элементов массива
        int sumOfEven = 0, sumOfOdd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                sumOfEven += a[i];
            else
                sumOfOdd += a[i];
        }
        System.out.println("Summ of even elements is " + sumOfEven);
        System.out.println("Summ of odd elements is " + sumOfOdd);

    }
}
