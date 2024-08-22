import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m = input.nextInt();
        System.out.println("Enter the value of n:");
        int n = input.nextInt();

        int a = n + 1;
        int result = (int) Math.pow(a, m);

        for (int i = 1; i <= n; i++) {
            int factorial1 = 1, factorial2 = 1, factorial3 = 1;
            for (int k = 1; k <= m + 1; k++) {
                factorial1 *= k;
            }
            for (int k = 1; k <= i; k++) {
                factorial2 *= k;
            }
            for (int k = 1; k < m + 1 - i; k++) {
                factorial3 *= k;
            }
            int combination = factorial1 / (factorial2 * factorial3);
            result = (int) (result + Math.pow(-1, i) * combination * Math.pow(n + 1 - i, m));
        }

        System.out.println("Result: " + result);
    }
}