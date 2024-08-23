import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int divisorCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            if (i % divisorCount == 0) {
                result.append(i).append(",");
            }
        }

        // Remove the trailing comma
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println(result.toString());
    }
}