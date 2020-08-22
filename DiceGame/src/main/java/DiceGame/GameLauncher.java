package DiceGame;

public class GameLauncher {
    public static void main(String[] args) {
        BattleArena battleArena = new BattleArena();
        Gladiator gladiator = new Gladiator("Russle",5);
        Tiger tiger = new Tiger("Tom",6);
        Archer archer = new Archer("Robin",7);

        battleArena.startBattle(gladiator,tiger);
    }
}
