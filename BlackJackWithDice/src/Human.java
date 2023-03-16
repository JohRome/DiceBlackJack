import java.util.ArrayList;

public class Human extends Player{

    private int score;
    private ArrayList<Integer> diceRolls;
    private Dice dice;
    public Human() {
        super(0, "Johan");
        this.diceRolls = new ArrayList<>();
        this.dice = new Dice();
    }
    @Override
    public void castDice() {

        for (int i = 0; i < 2; i++) {
            diceRolls.add(dice.rollDice());
            score += dice.getValue();
        }
    }
    public int getScore() {

        return score;
    }
}
