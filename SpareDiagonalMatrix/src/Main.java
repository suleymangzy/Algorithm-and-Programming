import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of rows and columns: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        int sum = 0;

        // Filling the matrix and calculating the sum of the secondary diagonal elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100);
                if (i + j == n - 1) {  // Condition for the secondary diagonal
                    sum += matrix[i][j];
                }
            }
        }

        // Displaying the matrix elements
        System.out.println("Elements of matrix 'a': ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSum of the secondary diagonal elements: " + sum);
    }
}