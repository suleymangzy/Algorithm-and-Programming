import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            double result = (double) (i + i / 10) + (1 + (i * (i + 1)) / 10.0);
            System.out.println(result);
        }
    }
}