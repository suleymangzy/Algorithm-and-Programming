import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = input.nextInt();
        int divisorSum = perfectNumberRecursive(num, 0, 1);
        checkPerfectNumber(num, divisorSum);
    }

    public static void checkPerfectNumber(int num, int sum) {
        if (num == sum) {
            System.out.println("Perfect number...");
        } else {
            System.out.println("Not a perfect number...");
        }
    }

    public static int perfectNumberRecursive(int num, int sum, int i) {
        if (num % i == 0 && num > i) {
            int newSum = sum + i;
            int newI = i + 1;
            return perfectNumberRecursive(num, newSum, newI);
        } else if (num > i) {
            int newI2 = i + 1;
            return perfectNumberRecursive(num, sum, newI2);
        } else {
            return sum;
        }
    }
}