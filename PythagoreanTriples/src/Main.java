import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n - i; j++) {
                int c = n - (i + j);
                if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(c, 2)) {
                    System.out.println(i + "," + j + "," + c + "," + (i * j * c));
                }
            }
        }
    }
}