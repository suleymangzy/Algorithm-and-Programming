import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();

        double a = 1 + Math.sqrt(2);
        double b = 1 - Math.sqrt(2);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            double pellNumber = (Math.pow(a, i) - Math.pow(b, i)) / (2 * Math.sqrt(2));
            result.append((int) pellNumber);
            if (i < n - 1) {
                result.append(",");
            }
        }

        System.out.println(result.toString());
    }
}