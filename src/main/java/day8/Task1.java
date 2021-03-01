package day8;

import java.sql.Time;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String string = 0 + " ";
        for (int i = 1; i < 20001; i++) {
            string = string + i + " ";
        }
        System.out.println(string);
        long finish = System.currentTimeMillis();
        long howMuchTime = finish - start;
        System.out.println(howMuchTime);

        StringBuilder sb = new StringBuilder();
        long startSb = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            sb = sb.append(i + " ");
        }
        long finishSb = System.currentTimeMillis();
        long howMuchTimeSb = finishSb - startSb;
       System.out.println(sb);
        System.out.println(howMuchTimeSb);
    }
}
