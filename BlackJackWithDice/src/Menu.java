import java.util.Scanner;

public class Menu {
    public void showMainMenu() {
        System.out.println("1. Play against yourself to 21");
        System.out.println("2. Play against a computer");
        System.out.println("3. Exit game");
    }

    public int userOption(int menuStartIndex, int menuEndIndex) {
        Scanner input = new Scanner(System.in);
        int userOption = 0;

        while (userOption < menuStartIndex || userOption > menuEndIndex) {
            System.out.print("Enter your choise: ");
            userOption = input.nextInt();
        }
        return userOption;
    }

}
