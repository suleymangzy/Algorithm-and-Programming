import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a string:");
        String x = input.nextLine();

        for (int i = 0; i < x.length(); i++) {
            int n = random.nextInt(10);
            if (n % 2 == 0) {
                System.out.print(Character.toUpperCase(x.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(x.charAt(i)));
            }
        }
    }
}