package day4;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int[] massiv = new int[100];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10000);
        }
        int max = massiv[0];
        int min = massiv[0];
        int count0 = 0;
        int summ0 = 0;

        for (int x : massiv
        ) {
            if (x>max) max = x;
            if (x<min) min = x;
            if (x % 10 == 0){
                count0++;
                summ0 = summ0 + x;
            }
            if (x ==0) count0++;

        }
        System.out.println("Наибольший элемент массива: " + max );
        System.out.println("Наименьший элемент массива: " + min );
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count0 );
        System.out.println("Сумму элементов массива, оканчивающихся на 0 " + summ0 );
    }
}
