import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = input.nextInt();
        System.out.println("Enter the second number:");
        int y = input.nextInt();

        int min = (x < y) ? x : y;
        int gcd = 1, lcm;

        for (int i = min; i > 0; i--) {
            if ((x % i == 0) && (y % i == 0)) {
                gcd = i;
                break;
            }
        }

        lcm = (x * y) / gcd;
        System.out.println("The GCD of " + x + " and " + y + " is: " + gcd + " and the LCM is: " + lcm);
    }
}