import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();
        System.out.println("Enter the range for the elements:");
        int range = input.nextInt();
        generateAndSortArray(n, range);
    }
    public static void generateAndSortArray(int numElements, int range) {
        Random random = new Random();
        int[] array = new int[numElements];
        System.out.print("Array elements: ");
        for (int i = 0; i < numElements; i++) {
            array[i] = random.nextInt(range);
            System.out.print(array[i] + ", ");
        }

        // Sort the array in ascending order
        int temp;
        for (int i = 0; i < numElements; i++) {
            for (int j = i + 1; j < numElements; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Array sorted in ascending order: ");
        for (int i = 0; i < numElements; i++) {
            System.out.print(array[i]);
            if (i < numElements - 1) {
                System.out.print(", ");
            }
        }
    }
}