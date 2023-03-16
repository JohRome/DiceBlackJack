import java.util.ArrayList;

public abstract class Player {
    private int score;
    private String name;

    public Player(int score, String name) {
        this.score = score;
        this.name = name;
    }

    abstract public void castDice();


}
