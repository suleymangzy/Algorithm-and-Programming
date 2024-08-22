import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the sequence:");
        int numElements = input.nextInt();
        int[] sequence = new int[numElements];

        if (numElements > 0) {
            sequence[0] = 1;
        }
        if (numElements > 1) {
            sequence[1] = 1;
        }

        for (int i = 2; i < numElements; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        for (int i = 0; i < numElements; i++) {
            System.out.print(sequence[i] + (i < numElements - 1 ? ", " : ""));
        }
    }
}