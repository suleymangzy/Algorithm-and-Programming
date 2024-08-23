import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dividend:");
        int dividend = input.nextInt();
        System.out.println("Enter the divisor:");
        int divisor = input.nextInt();
        System.out.println("Which digit of the quotient would you like to display?");
        int digitPosition = input.nextInt();

        int quotient = dividend / divisor;
        int digit = 0;

        for (int i = 1; i <= digitPosition; i++) {
            digit = quotient % 10;
            quotient = quotient / 10;
        }

        System.out.println("The digit at position " + digitPosition + " is: " + digit);
    }
}