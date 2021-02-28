package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y1;
        double y2;
        if (x >= 5.0) {
            y1 = ((x * x) - 10) / (x + 7);
            System.out.println(y1);
        } else if (-3 < x && x <= 5) {
             y2 = (x + 3) * ((x * x) - 2);
            System.out.println(y2);
        } else {
            System.out.println(420.0);
        }

    }
}
