import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for element " + (i + 1) + " of the array:");
            int value = input.nextInt();
            array[i] = value;
        }

        System.out.println("Enter the value of x for the polynomial function created from the array:");
        int x = input.nextInt();

        int polynomialResult = 0;
        for (int i = 0; i < n; i++) {
            polynomialResult += (int) (array[i] * Math.pow(x, i));
        }

        System.out.println("The result of the polynomial function is: " + polynomialResult);
    }
}