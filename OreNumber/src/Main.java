import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int a = input.nextInt();
        int s = 0;
        double t = 0;  // Changed to double to handle fractional values

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                s++;
                t += 1.0 / i;  // Ensure division is done with floating point
            }
        }

        double ho = s / t;  // Changed to double to handle fractional values
        System.out.println(ho);
        System.out.println("If the resulting value is an integer, it is an Ore number.");
    }
}