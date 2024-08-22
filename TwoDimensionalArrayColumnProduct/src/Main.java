import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of rows and columns:");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        int[] columnProducts = new int[n];

        // Generate and display the matrix
        System.out.println("Matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        // Calculate the product of each column's elements
        for (int i = 0; i < n; i++) {
            columnProducts[i] = 1;
            for (int j = 0; j < n; j++) {
                columnProducts[i] *= matrix[j][i];
            }
        }

        // Display the product of each column
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Product of elements in column " + (i + 1) + ": " + columnProducts[i]);
        }
    }
}