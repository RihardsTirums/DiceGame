package DiceGame;

public class BattleArena {
    public static void startBattle(Player player1, Player player2) {
        int roundCount = 0;
        while (player1.getHealthPoints() > 0 && player2.getHealthPoints() > 0) {
            roundCount++;
            int player1Number = player1.rollDice();
            int player2Number = player2.rollDice();
            System.out.println("Round number:" + roundCount);
            System.out.println(player1.getClass().getSimpleName() + " Player1 number: " + player1Number + " "+ player2.getClass().getSimpleName() + " Player2 number: " + player2Number);
            if (player1Number < player2Number) {
                player1.loseHp(1);
                System.out.println(player1.getClass().getSimpleName() + " Player1 lost one HP, hp left:" + player1.getHealthPoints());
            } else if (player2Number < player1Number) {
                player2.loseHp(1);
                System.out.println(player2.getClass().getSimpleName() + " Player2 lost one HP, hp left:" + player2.getHealthPoints());
            }
            if (player1.getHealthPoints() == 0) {
                System.out.println("Player1: " + player1.getName() + " LOST");
                System.out.println("Game over");
            } else if (player2.getHealthPoints() == 0) {
                System.out.println("Player2: " + player2.getName() + " LOST");
                System.out.println("Game over");
            }
        }
    }
}