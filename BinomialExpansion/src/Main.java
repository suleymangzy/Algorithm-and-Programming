import java.util.Scanner;
public class Main {
    // Method to calculate factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate binomial coefficient
    public static long binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = input.nextInt();
        System.out.println("Enter the value of b:");
        int b = input.nextInt();
        System.out.println("Enter the value of n:");
        int n = input.nextInt();

        System.out.println("Binomial expansion of (" + a + " + " + b + ")^" + n + " is:");

        // Print each term of the expansion
        for (int k = 0; k <= n; k++) {
            long coef = binomialCoefficient(n, k);
            long aTerm = (long) Math.pow(a, n - k);
            long bTerm = (long) Math.pow(b, k);
            System.out.print(coef + " * " + aTerm + " * " + bTerm);
            if (k < n) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }
}