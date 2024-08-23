import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the upper limit:");
        int n = input.nextInt();
        StringBuilder perfectNumbers = new StringBuilder();

        // Iterate through potential values to find perfect numbers
        for (int i = 2; i <= n; i++) {
            // Calculate Mersenne number
            int mersenneNumber = (int) (Math.pow(2, i) - 1);

            // Check if Mersenne number is prime
            if (isPrime(mersenneNumber)) {
                // Calculate the perfect number
                long perfectNumber = (long) (Math.pow(2, i - 1) * mersenneNumber);
                perfectNumbers.append(perfectNumber).append(",");
            }
        }

        // Remove the trailing comma if there are any perfect numbers
        if (perfectNumbers.length() > 0) {
            perfectNumbers.setLength(perfectNumbers.length() - 1);
        }

        // Print the result
        System.out.println("Perfect numbers: " + perfectNumbers);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }
}