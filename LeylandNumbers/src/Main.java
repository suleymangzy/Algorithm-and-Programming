import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for x:");
        int x = input.nextInt();
        System.out.println("Enter the value for y:");
        int y = input.nextInt();

        // Use StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Calculate and append Leyland numbers for the given x and y
        for (int i = 2; i <= x; i++) {
            for (int j = 2; j <= y; j++) {
                int leylandNumber = (int) (Math.pow(i, j) + Math.pow(j, i));
                result.append(leylandNumber).append(", ");
            }
        }

        // Remove the trailing comma and space if result is not empty
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        // Print the result
        System.out.println(result.toString());
    }
}