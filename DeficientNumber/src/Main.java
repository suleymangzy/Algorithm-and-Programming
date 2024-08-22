import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int sumOfDivisors = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors < 2 * number) {
            System.out.println("The number is deficient, and the deficiency amount is: " + (2 * number - sumOfDivisors));
        } else {
            System.out.println("The number is not deficient.");
        }
    }
}