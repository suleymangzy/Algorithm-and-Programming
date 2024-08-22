import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((int) (Math.pow(2, Math.pow(2, i)) + 1) + ", ");
        }
    }
}