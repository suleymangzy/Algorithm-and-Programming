import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = input.nextInt();
        double y = Math.pow(x, 2) - 5 * x + 3;

        if (y > 0) {
            System.out.println("The function is positive.");
        } else if (y < 0) {
            System.out.println("The function is negative.");
        } else {
            System.out.println("The function is zero.");
        }
    }
}