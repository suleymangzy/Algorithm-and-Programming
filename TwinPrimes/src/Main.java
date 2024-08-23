import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the upper limit:");
        int n = input.nextInt();
        int divisorCount, twinPrimeCount;

        for (int i = 2; i <= n; i++) {
            divisorCount = 0;
            twinPrimeCount = 0;

            // Count the number of divisors of i
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }

            // Check if i is a prime number
            if (divisorCount == 2) {
                // Count the number of divisors of i + 2
                for (int j = 1; j <= i + 2; j++) {
                    if ((i + 2) % j == 0) {
                        twinPrimeCount++;
                    }
                }

                // Check if i + 2 is also a prime number
                if (twinPrimeCount == 2) {
                    System.out.println(i + ", " + (i + 2));
                }
            }
        }
    }
}