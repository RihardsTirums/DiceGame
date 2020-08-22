package DiceGame;

import java.util.Random;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player (String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public int rollDice(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }

    public String getName(){
        return name;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public void loseHp(int lostHp){
        healthPoints = healthPoints - lostHp;
    }
}
