package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int et = scanner.nextInt();
        if (0 < et && et < 5) {
            System.out.println("Малоэтажный дом");
        } else if (4 < et && et < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (et > 8) {
            System.out.println("Многоэтажный дом");
        }else System.out.println("Ошибка ввода");
    }
}
