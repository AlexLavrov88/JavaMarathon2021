package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10000);
        }
        int summ = 0;
        int maxsumm = 0;
        int count = 0;
        for (int i = 0; i < mas.length -2; i++) {
            summ = 0;
            for (int j = i; j < i + 3; j++) {
                summ = summ +mas[j];
            }
            if (summ > maxsumm) {
                maxsumm = summ;
                count = i;
            }
        }
        System.out.println(summ);
        System.out.println(count);
    }
}

