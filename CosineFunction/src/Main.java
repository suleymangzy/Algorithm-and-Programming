import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = input.nextInt();
        System.out.println("Enter the number of terms (n):");
        int n = input.nextInt();
        int t = 1;

        // Calculate the cosine function using Taylor series expansion
        for (int i = 1; i < n; i++) {
            int factorial = 1;
            for (int j = 1; j <= 2 * i; j++) {
                factorial *= j;
            }
            t += (int) (Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial);
        }

        System.out.println("Result: " + t);
    }
}