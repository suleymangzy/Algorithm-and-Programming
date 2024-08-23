import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String txt = input.nextLine();
        int n = txt.length() / 2;

        // Print the first half in reverse
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(txt.charAt(i));
        }

        // Print the second half normally
        for (int i = txt.length() - 1; i >= n; i--) {
            System.out.print(txt.charAt(i));
        }
    }
}