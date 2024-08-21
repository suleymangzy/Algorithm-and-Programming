import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOfDivisors = 0;
        int countOfDivisors = 0;

        System.out.println("Enter a number:");
        int x = input.nextInt();

        // Calculate the sum and count of divisors of the number
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                sumOfDivisors += i;
                countOfDivisors++;
            }
        }

        // Check if the number is an arithmetic number
        if (sumOfDivisors % countOfDivisors == 0) {
            System.out.println("Arithmetic number");
        } else {
            System.out.println("Not an arithmetic number");
        }
    }
}