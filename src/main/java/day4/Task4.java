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
        int count = 0;
        for (int i = 1; i < mas.length-1; i++) {
            int summ3 = mas[i - 1] + mas[i] + mas[i + 1];

            if (summ < summ3) {
                summ = summ3;
                count = i - 1;
            }
        }
        System.out.println(summ);
        System.out.println(count);
    }
}
