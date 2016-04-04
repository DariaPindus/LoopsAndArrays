package ua.od.pindus;

/**
 *10. Вывести первые 5 минимальных элементов массива
 */
public class FirstMinimal {
    public static void main(String[] args) {
        int temp_min;
        int index_min;
        int[] a = {20, 4, -9, 12, 78, 0, 69, -14, 71, 52, 45, 1};
        int min;

        for (int i = 0; i < 5; i++) {
            min = a[i];
            index_min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    index_min = j;
                }
            }
            if (i != index_min) {
                temp_min = a[i];
                a[i] = a[index_min];
                a[index_min] = temp_min;
            }
            System.out.println(a[i]);
        }
    }
}
