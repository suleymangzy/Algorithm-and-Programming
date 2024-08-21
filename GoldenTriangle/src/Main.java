import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the shorter side of the golden triangle:");
        int a = input.nextInt();

        // Calculating the length of the longer sides based on the golden ratio
        int b = (int) (a * (1 + Math.sqrt(5)) / 2);

        System.out.println("Golden triangle side lengths: " + a + ", " + b + ", " + b);
    }
}