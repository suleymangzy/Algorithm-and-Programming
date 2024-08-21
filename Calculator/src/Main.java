import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2, choice;

        System.out.println("Enter the first number:");
        number1 = scan.nextInt();

        System.out.println("Enter the second number:");
        number2 = scan.nextInt();

        System.out.println("Select the operation you want to perform:");
        System.out.println("\n1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
        System.out.print("Your choice: ");
        choice = scan.nextInt();

        // Switch Case Implementation
        switch (choice) {
            case 1:
                System.out.println("Addition: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Subtraction: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication: " + (number1 * number2));
                break;
            case 4:
                if (number2 == 0) {
                    System.out.println("The second number is 0, division is undefined.");
                } else {
                    System.out.println("Division: " + ((double) number1 / number2));
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // If-Else Implementation
        if (choice == 1) {
            System.out.println("Addition: " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Subtraction: " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Multiplication: " + (number1 * number2));
        } else if (choice == 4) {
            if (number2 == 0) {
                System.out.println("The second number is 0, division is undefined.");
            } else {
                System.out.println("Division: " + ((double) number1 / number2));
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
