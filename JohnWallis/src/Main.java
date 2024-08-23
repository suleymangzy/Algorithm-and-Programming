import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();
        double result = 1.0;  // Use double to handle fractional values

        // Apply the Wallis product formula
        for (int k = 1; k <= n; k++) {
            double term = (4.0 * k * k) / ((4.0 * k * k) - 1);
            result *= term;
        }

        // The Wallis product approximation of pi is 2 * result
        System.out.println("Result:\t" + (2 * result));
    }
}