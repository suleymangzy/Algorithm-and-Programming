import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();

        System.out.println("Enter the upper limit for the values of the array elements:");
        int upperLimit = input.nextInt();

        generateRandomArray(n, upperLimit);
    }

    public static void generateRandomArray(int size, int upperLimit) {
        Random random = new Random();
        int[][] array = new int[size][size];

        System.out.println("Elements of the array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(upperLimit);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}