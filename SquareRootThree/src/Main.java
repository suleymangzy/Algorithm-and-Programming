import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();
        double t = 1.0;  // Use double to handle fractional values

        // Apply the series formula for approximating the square root of 3
        for (int i = 1; i <= n - 1; i++) {
            t = 1 + 1 / (2 + 1 / t);
        }
        System.out.println("Result: " + (1 + 1 / t));
    }
}