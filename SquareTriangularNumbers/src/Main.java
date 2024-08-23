import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();

        // Initialize the first two terms of the sequence
        int previousTerm = 0;
        int currentTerm = 1;

        System.out.print(currentTerm);

        // Generate and display the sequence
        for (int i = 1; i < n; i++) {
            int nextTerm = 34 * currentTerm - previousTerm + 2;
            System.out.print(", " + nextTerm);
            previousTerm = currentTerm;
            currentTerm = nextTerm;
        }
    }
}