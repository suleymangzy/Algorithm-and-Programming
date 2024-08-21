import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size of the matrix (number of rows and columns):");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        int total = 0;

        // Fill the matrix with random values and print it
        System.out.println("Matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + "\t");
                if (j == (n - 1)) {
                    total += matrix[i][j];
                }
                if (i == (n - 1)) {
                    total += matrix[i][j];
                }
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Adjust total by removing the bottom-right element as it is added twice
        total -= matrix[n - 1][n - 1];
        System.out.println("Result: " + total);
    }
}