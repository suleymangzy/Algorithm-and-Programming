import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100) + 1; // Number between 1 and 100
        int attempts = 0;
        int guess;

        do {
            System.out.println("Enter your guess:");
            guess = input.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Enter a smaller number...");
            } else if (guess < secretNumber) {
                System.out.println("Enter a larger number...");
            }
            System.out.println(" ");
        } while (guess != secretNumber);

        System.out.println("You found the correct number in " + attempts + " attempts.");
    }
}