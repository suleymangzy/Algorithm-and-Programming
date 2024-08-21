import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int countDivisors = 0;
        int countDivisorsPlusTwo = 0;

        // Check if the number is a prime number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                countDivisors++;
            }
        }
        if (countDivisors == 0) {
            System.out.println(number + " is a prime number.");
        }

        // Check if the number plus 2 is a prime number
        for (int i = 2; i < (number + 2); i++) {
            if ((number + 2) % i == 0) {
                countDivisorsPlusTwo++;
            }
        }
        if (countDivisors == 0 && countDivisorsPlusTwo == 0) {
            System.out.println("Chen prime");
        } else {
            System.out.println("Not a Chen prime");
        }
    }
}