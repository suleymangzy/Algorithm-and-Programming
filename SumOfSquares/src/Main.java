import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = input.nextInt();
        int a, b;

        // Find and display pairs (a, b) where x equals a^2 + b^2
        for (a = 0; a < x; a++) {
            for (b = 0; b < x; b++) {
                if (x == (a * a + b * b)) {
                    System.out.println(a + ", " + b);
                }
            }
        }
    }
}