import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of rows/columns for the square matrices:");
        int n = input.nextInt();

        System.out.println("Enter the upper limit for the values of the matrix elements:");
        int upperLimit = input.nextInt();

        sumMatrices(n, upperLimit);
    }

    public static void sumMatrices(int size, int range) {
        Random random = new Random();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] sumMatrix = new int[size][size];

        // Generate and display elements of the first matrix
        System.out.println("Elements of the first matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = random.nextInt(range);
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println(); // Move to the next line for the next row
        }

        System.out.println();

        // Generate and display elements of the second matrix
        System.out.println("Elements of the second matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix2[i][j] = random.nextInt(range);
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println(); // Move to the next line for the next row
        }

        System.out.println();

        // Calculate and display the sum of the two matrices
        System.out.println("Elements of the matrix formed by adding the corresponding elements of the two matrices:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}