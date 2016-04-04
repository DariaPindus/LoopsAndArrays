package ua.od.pindus;

/*. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015*/

public class Main {

    public static void main(String[] args) {
        // write your code here
        //1. все четырёхзначные числа последовательности 1000 1003 1006 1009
        int a = 1000;

        do {
            a += 3;
            System.out.println(a);
        }
        while (a != 10000);
        System.out.println(" ");


        //3. все неотрицательные элементы последовательности 90 85 80
        for (int k = 90; k >= 0; k -= 5) {
            System.out.println(k);
        }
        System.out.println(" ");


        //2. первые 55 элементов последовательности 1 3 5 7 9 11
        a = 1;
        System.out.println(a);
        for (int i = 0; i < 55; i++) {
            a += 2;
            System.out.println(a);
        }
        System.out.println(" ");

        //4. выводящую на экран первые 20 элементов последовательности 2 4 8 16 32
        a = 2;
        System.out.println(a);
        for (int i = 0; i < 19; i++) {
            a *= 2;
            System.out.println(a);
        }

    }
}
