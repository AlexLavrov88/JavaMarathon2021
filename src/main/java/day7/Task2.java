package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int minStamina = 90;
        int maxStamina = 100;
        int staminaRandom = minStamina + random.nextInt(maxStamina - minStamina + 1);
        Player player1 = new Player(staminaRandom);
        Player player2 = new Player(staminaRandom);
        Player player3 = new Player(staminaRandom);
        Player player4 = new Player(staminaRandom);
        Player player5 = new Player(staminaRandom);
        Player player6 = new Player(staminaRandom);
        Player player7 = new Player(staminaRandom);

        Player.info();

        while (player1.getStamina() > Player.MIN_STAMINA) {
            player1.run();
        }
        Player.info();


    }
}
