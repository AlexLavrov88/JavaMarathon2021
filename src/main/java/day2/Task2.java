package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Некорректный ввод");
        }
        if (b > a) {
            for (int c = a; c < b; c++) {
                if (c % 5 == 0 && c % 10 != 0 && c != a && c != b) {
                    System.out.print(c + " ");
                }
            }
        }
    }
}
