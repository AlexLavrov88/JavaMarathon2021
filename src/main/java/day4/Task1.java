package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int leigh = scanner.nextInt();
        int[] a = new int[leigh];
        for (int i = 0; i <a.length ; i++) {
            a[i] = (random.nextInt(11));
        }
        int countMaxEight = 0;
        int countOne = 0;
        int countYes = 0;
        int countNo = 0;
        int countSumm = 0;
        for (int x : a
        ) {
            if (x > 8) countMaxEight++;
            if( x==1) countOne++;
            if (x %2 ==0 ) countYes++;
            if(x%2!=0) countNo++;
            countSumm = countSumm + x;
        }
        System.out.println("Длина массива: " + a.length);
        System.out.println("Количество чисел больше 8: " + countMaxEight);
        System.out.println("Количество чисел равных 1: " + countOne);
        System.out.println("Количество четных чисел: " + countYes);
        System.out.println("Количество нечетных чисел: " + countNo);
        System.out.println("Сумма всех элементов массива: " + countSumm);

    }
}
