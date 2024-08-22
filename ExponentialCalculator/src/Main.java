import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = input.nextInt();
        System.out.println("Enter the value of n:");
        int n = input.nextInt();

        double result = 1, factorial = 1;
        for (int i = 1; i < n - 1; i++) {
            factorial *= i;
            result += Math.pow(x, i) / factorial;
        }

        System.out.println("Result: " + result);
    }
}