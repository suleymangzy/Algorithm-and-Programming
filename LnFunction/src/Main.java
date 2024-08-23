import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = input.nextInt();
        double t = 0.0;  // Use double to handle fractional values

        // Compute the series sum
        for (int i = 0; i < x - 1; i++) {
            t += 1.0 / ((2 * i + 1) * (2 * i + 2));
        }

        System.out.println("Result:\t" + t);
    }
}