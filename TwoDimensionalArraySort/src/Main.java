import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size of the matrix (number of rows and columns):");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        // Generate and display the matrix
        System.out.println("Matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        // Display the matrix in matrix form
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        // Create a 3D array to hold the matrix rows
        int[][][] sortedMatrix = new int[n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sortedMatrix[i][i][j] = matrix[i][j];
            }
        }

        // Sort each row in ascending order
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (sortedMatrix[i][i][j] > sortedMatrix[i][i][k]) {
                        temp = sortedMatrix[i][i][j];
                        sortedMatrix[i][i][j] = sortedMatrix[i][i][k];
                        sortedMatrix[i][i][k] = temp;
                    }
                }
            }
        }

        // Display the sorted rows
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print("Row " + (i + 1) + " sorted: ");
            for (int j = 0; j < n; j++) {
                System.out.print(sortedMatrix[i][i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}