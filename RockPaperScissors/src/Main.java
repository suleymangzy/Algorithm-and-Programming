import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"ROCK", "PAPER", "SCISSORS"};
        int userChoice;

        // Prompt user to select a choice
        do {
            System.out.println("Choose:");
            System.out.println("1 - ROCK");
            System.out.println("2 - PAPER");
            System.out.println("3 - SCISSORS");

            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Your choice: ROCK");
                    break;
                case 2:
                    System.out.println("Your choice: PAPER");
                    break;
                case 3:
                    System.out.println("Your choice: SCISSORS");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (userChoice > 3 || userChoice < 1);

        // Computer randomly selects a choice
        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];
        System.out.println("Computer's choice: " + computerChoice);

        // Determine the result of the game
        if (userChoice == computerChoiceIndex + 1) {
            System.out.println("DRAW");
        } else if ((userChoice == 1 && computerChoiceIndex == 2) ||
                (userChoice == 2 && computerChoiceIndex == 0) ||
                (userChoice == 3 && computerChoiceIndex == 1)) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }
    }
}