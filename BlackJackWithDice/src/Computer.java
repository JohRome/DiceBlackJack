import java.util.ArrayList;

public class Computer extends Player{

    private int score;
    private ArrayList<Integer> diceRolls;
    private Dice dice;
    public Computer() {
        super(0, "Herr Robot 3000");
        this.diceRolls = new ArrayList<>();
        this.dice = new Dice();
    }
    @Override
    public void castDice() {
        while (score < 20) {
            for (int i = 0; i < 2; i++) {
                diceRolls.add(dice.rollDice());
                score += dice.getValue();
            }
        }
    }
    public int getScore() {
        return score;
    }
}
