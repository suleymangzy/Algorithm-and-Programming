import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 1:");
        int x = input.nextInt();
        boolean firstFactor = true;

        for (int i = 2; x > 1; i++) {
            if (x % 2 == 0) {
                while (x % 2 == 0) {
                    x = x / 2;
                }
                if (!firstFactor) {
                    System.out.print(", ");
                }
                System.out.print(2);
                firstFactor = false;
            }

            while (x % i == 0 && i % 2 != 0) {
                if (!firstFactor) {
                    System.out.print(", ");
                }
                System.out.print(i);
                x /= i;
                firstFactor = false;
            }
        }
    }
}