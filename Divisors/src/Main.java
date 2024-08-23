import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the number:");
        int number = input.nextInt();

        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                System.out.print(divisor);
                if (divisor < number) {
                    System.out.print(", ");
                }
            }
        }
    }
}