import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of rows and columns:");
        int n = input.nextInt();

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        // Filling matrix 'a' and generating lower triangular matrix 'b'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(100);

                if (i < j) {
                    b[i][j] = 0;
                } else {
                    b[i][j] = a[i][j];
                }
            }
        }

        // Displaying matrix 'a'
        System.out.println("Matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Displaying matrix 'b'
        System.out.println("Matrix B (Lower Triangular Matrix):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}