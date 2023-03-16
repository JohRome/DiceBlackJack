public class Dice {
    private int value;
    public int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public int getValue() {
        value = rollDice();
        return value;
    }
}
