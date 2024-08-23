import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = input.nextInt();
        System.out.println("Enter the value of n:");
        int n = input.nextInt();
        double t = 0.0;

        for (int i = 0; i < n; i++) {
            int factorial = 1;
            for (int j = 1; j <= 2 * i + 1; j++) {
                factorial *= j;
            }

            t += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial;
        }

        System.out.println("sin(" + x + ") = " + t);
    }
}