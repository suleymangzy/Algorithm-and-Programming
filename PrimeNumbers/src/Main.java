import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the upper limit:");
        int x = input.nextInt();

        boolean firstPrime = true;
        for (int i = 2; i <= x; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                if (!firstPrime) {
                    System.out.print(", ");
                }
                System.out.print(i);
                firstPrime = false;
            }
        }
    }
}