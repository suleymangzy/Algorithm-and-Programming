import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        // Input matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the element at position " + (i + 1) + ", " + (j + 1) + ":");
                matrix[i][j] = input.nextInt();
            }
        }

        // Check if the matrix is symmetric
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matrix[i][j] != matrix[j][i]) {
                    System.out.println("The matrix is not symmetric.");
                    System.exit(0); // Terminates the program if the matrix is not symmetric
                }
            }
        }

        System.out.println("The matrix is symmetric.");
    }
}