import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = input.nextInt();
        int[] A = new int[n];
        int positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of element " + (i + 1) + ":");
            int x = input.nextInt();
            A[i] = x;
            if (x > 0) {
                positiveCount++;
            } else if (x < 0) {
                negativeCount++;
            }
        }

        int[] B = new int[positiveCount];
        int[] C = new int[negativeCount];
        int posIndex = 0, negIndex = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] > 0) {
                B[posIndex] = A[i];
                posIndex++;
            } else if (A[i] < 0) {
                C[negIndex] = A[i];
                negIndex++;
            }
        }

        System.out.print("Elements of array A: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println();

        System.out.print("Elements of array B (positive numbers): ");
        for (int i = 0; i < positiveCount; i++) {
            System.out.print(B[i] + ", ");
        }
        System.out.println();

        System.out.print("Elements of array C (negative numbers): ");
        for (int i = 0; i < negativeCount; i++) {
            System.out.print(C[i] + ", ");
        }
    }
}
