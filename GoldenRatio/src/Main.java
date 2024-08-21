import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the line segment:");
        int ab = input.nextInt();

        int cb = (int) (2 * ab / (1 + Math.sqrt(5))); // Calculating the smaller segment based on the golden ratio
        int ac = ab - cb; // Calculating the other segment

        System.out.println("Segments: " + ac + ", " + cb);
    }
}