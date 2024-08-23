import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum, N, A;

        System.out.println("Enter the value of 'N':");
        N = input.nextInt();
        A = 1;
        sum = 0;

        // Calculate the sum of odd numbers up to N
        while (A <= N) {
            sum += A;
            A += 2;
        }

        System.out.println(sum);
    }
}