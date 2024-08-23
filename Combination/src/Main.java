import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the set:");
        int n = input.nextInt();
        System.out.println("Enter the size of the combinations you want to calculate:");
        int r = input.nextInt();

        int f1 = 1;  // Factorial of n
        int f2 = 1;  // Factorial of r
        int f3 = 1;  // Factorial of (n - r)

        // Calculate factorial of n
        for (int a = 1; a <= n; a++) {
            f1 *= a;
        }
        // Calculate factorial of r
        for (int b = 1; b <= r; b++) {
            f2 *= b;
        }
        // Calculate factorial of (n - r)
        for (int c = 1; c <= (n - r); c++) {
            f3 *= c;
        }

        // Calculate the combination (nCr)
        int combination = f1 / (f2 * f3);
        System.out.println("The number of " + r + "-combinations from a set of " + n + " elements is: " + combination);
    }
}