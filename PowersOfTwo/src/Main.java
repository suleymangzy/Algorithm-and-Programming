import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = input.nextInt();
        int k = 1;  // Initialize k to 1 for the first power of 2

        for (int i = 0; k <= x; i++) {
            k = (int) Math.pow(2, i);  // Calculate 2^i
            if (k <= x) {
                System.out.println(k);
            }
        }
    }
}