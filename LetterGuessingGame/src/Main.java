import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Generate a random letter between 'A' and 'Z'
        char targetLetter = (char) (random.nextInt(26) + 'A');

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter your guess:");
            char guess = scan.next().charAt(0);

            if (guess == targetLetter) {
                System.out.println("Correct letter found in attempt " + i + "!");
                return; // Exit the program if the correct letter is guessed
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
        }

        System.out.println("You've used all 10 attempts. The correct letter was " + targetLetter + ".");
    }
}