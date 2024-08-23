import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int s = input.nextInt();
        int t = 0;
        for (int i = 1; i <= s - 1; i++) {
            if (s % i == 0) {
                t += i;
            }
        }
        if (s == t) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is not a perfect number.");
        }
    }
}