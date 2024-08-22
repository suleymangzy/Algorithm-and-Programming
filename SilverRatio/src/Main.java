import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the line segment:");
        int length = input.nextInt();

        double silverRatio = 1 + Math.sqrt(2);
        int b = (int) (length / silverRatio);
        int a = length - b;

        System.out.println(a + ", " + b);
    }
}