import java.util.Locale;
import java.util.Scanner;

public class Application {
    private Human human;
    private Computer computer;
    private Menu menu;

    public Application() {
        System.out.println("Welome to Black Jack dice edition");
        this.menu = new Menu();
    }

    public void startGame() {

        boolean isDone = false;
        while (!isDone) {

            menu.showMainMenu();
            int userOption = menu.userOption(1, 3);
            switch (userOption) {
                case 1 -> soloPlay();
                case 2 -> duoPlay();
                case 3 -> isDone = true;
            }
        }
    }

    public void soloPlay() {
        this.human = new Human();
        Scanner input = new Scanner(System.in);

        String answer = "";
        boolean isPlaying = true;

        while (isPlaying) {
            human.castDice();
            System.out.println("Du fick " + human.getScore() + " poäng");
            if (human.getScore() == 21) {
                System.out.println("JACKPOTT");
                isPlaying = false;
            }
            if (human.getScore() > 21) {
                System.out.println("Tyvärr, du slog över 21");
                isPlaying = false;
            } else {
                System.out.println("Vill du fortsätta? j/n");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("Du slutade på " + human.getScore());
                    isPlaying = false;
                }
            }
        }

        startGame();
    }
    public void duoPlay() {
        this.computer = new Computer();

        computer.castDice();
        if (computer.getScore() > 21)
            System.out.println("Datorn slog över 21. Se till att inte slå över hans poäng");
        else
            System.out.println("Datorn slog " + computer.getScore() + "! Försök slå det");

        soloPlay();
    }
}
