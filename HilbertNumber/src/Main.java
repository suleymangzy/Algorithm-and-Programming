import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int s = input.nextInt();

        // Check if the number is a Hilbert number
        if ((s - 1) % 4 == 0) {
            System.out.println(s + " is a Hilbert number.");
        } else {
            System.out.println(s + " is not a Hilbert number.");
        }
    }
}