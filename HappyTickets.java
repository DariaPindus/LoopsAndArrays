package ua.od.pindus;

/**
 * 8. Найти все счастливые билеты от 100000 до 999999
 * билет счастливый если сумма первых трех цифр равна сумме трех последних
 * например,
 * 123312 - 1+2+3=3+1+2
 */
public class HappyTickets {
    public static void main(String[] args) {
        int a, a_1, a_2, a_3, a_4, a_5, a_6;


        for (a = 100000; a <= 999999; a++) {
            a_1 = a / 1000;
            a_4 = a % 1000;

            a_3 = a_1 % 10;
            a_2 = (a_1 / 10) % 10;
            a_1 = a_1 / 100;

            a_5 = (a_4 / 10) % 10;
            a_4 = a_4 / 100;
            a_6 = a % 10;
            if ((a_1 + a_2 + a_3) == (a_4 + a_5 + a_6))
                System.out.println(a);
        }

    }
}
