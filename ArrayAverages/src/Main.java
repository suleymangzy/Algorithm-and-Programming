import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "th element of the array:");
            int x = input.nextInt();
            array[i] = x;
        }

        int sum = 0;
        int product = 1;
        double harmonicSum = 0;
        double squaredSum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];
            product *= array[i];
            harmonicSum += 1.0 / array[i];
            squaredSum += Math.pow(array[i], 2);
        }

        double arithmeticMean = (double) sum / n;
        double geometricMean = Math.pow(product, 1.0 / n);
        double harmonicMean = n / harmonicSum;
        double contraharmonicMean = squaredSum / sum;

        System.out.println("Arithmetic mean of the array:\t" + arithmeticMean);
        System.out.println("Geometric mean of the array:\t" + geometricMean);
        System.out.println("Harmonic mean of the array:\t" + harmonicMean);
        System.out.println("Contraharmonic mean of the array:\t" + contraharmonicMean);
    }
}