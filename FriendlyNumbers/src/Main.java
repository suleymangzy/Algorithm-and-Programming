import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int m = input.nextInt();
        System.out.println("Enter the second number:");
        int n = input.nextInt();
        int sumOfDivisorsM = 0;
        int sumOfDivisorsN = 0;

        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                sumOfDivisorsM += i;
            }
        }

        for (int j = 1; j < n; j++) {
            if (n % j == 0) {
                sumOfDivisorsN += j;
            }
        }

        if (sumOfDivisorsM == n && sumOfDivisorsN == m) {
            System.out.println("The numbers are friendly numbers.");
        } else {
            System.out.println("The numbers are not friendly numbers.");
        }
    }
}