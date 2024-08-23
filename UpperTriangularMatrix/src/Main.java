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

        // Fill matrix a with random values and create upper triangular matrix b
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(100);

                if (i > j) {
                    b[i][j] = 0;
                } else {
                    b[i][j] = a[i][j];
                }
            }
        }

        // Print matrix a
        System.out.println("Matrix a:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
                if (j < n - 1) {
                    System.out.print("\t");  // Tab for spacing
                }
            }
            System.out.println();  // New line at the end of each row
        }

        // Print matrix b (upper triangular matrix)
        System.out.println("Matrix b (Upper Triangular Matrix):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j]);
                if (j < n - 1) {
                    System.out.print("\t");  // Tab for spacing
                }
            }
            System.out.println();  // New line at the end of each row
        }
    }
}