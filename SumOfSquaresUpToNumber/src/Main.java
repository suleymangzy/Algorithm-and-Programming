import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = input.nextInt();
        calculateSumOfSquares(n);
    }

    public static void calculateSumOfSquares(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Result: " + sum);
    }

}