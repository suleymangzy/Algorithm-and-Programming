import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();
        double t = 0.0;  // Use double for accurate fractional calculations

        for (int k = 0; k < n; k++) {
            t += Math.pow(-1, k) / ((2 * k + 1) * Math.pow(3, k));
        }

        double result = Math.sqrt(12) * t;
        System.out.println("Result:\t" + result);
    }
}