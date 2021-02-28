package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[12][8];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        int summ = 0;
        int summ1 = 0;
        int count = 0;
        for (int i = 0; i <matrix.length ; i++) {
            if (summ < summ1) {
                summ = summ1;
                count = i-1;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                 summ1 = +matrix[i][j];
            }
        }
        System.out.println(count);
    }
}
