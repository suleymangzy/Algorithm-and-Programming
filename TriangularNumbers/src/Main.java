import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int triangularNumber = i * (i + 1) / 2;
            if (i < n) {
                System.out.print(triangularNumber + ", ");
            } else {
                System.out.print(triangularNumber);
            }
        }
    }
}