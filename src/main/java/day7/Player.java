package day7;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private int stamina;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > 1) {
            stamina = stamina - 1;
        }
        if (stamina == 1) {
            stamina = stamina - 1;
            countPlayers = countPlayers - 1;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            int x = 6 - countPlayers;
            if (x == 1) System.out.println("Команды неполные. На поле еще есть " + x + " свободное место");
            if (x == 2 || x == 3 || x == 4) System.out.println("Команды неполные. На поле еще есть " + x + " свободных места");
            if (x == 5) System.out.println("Команды неполные. На поле еще есть " + x + " свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }
}
