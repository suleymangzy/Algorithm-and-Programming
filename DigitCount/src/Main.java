import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}