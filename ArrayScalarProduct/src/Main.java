import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements for the arrays:");
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] scalarProduct = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + " of array a:");
            a[i] = input.nextInt();
            System.out.println("Enter element " + (i + 1) + " of array b:");
            b[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            scalarProduct[i]= a[i] * b[i];
        }

        System.out.print("The scalar product of the arrays is: ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) { // Don't add comma when in last element
                System.out.print(scalarProduct[i]);
            } else {
                System.out.print(scalarProduct[i] + ", ");
            }
        }

    }
}