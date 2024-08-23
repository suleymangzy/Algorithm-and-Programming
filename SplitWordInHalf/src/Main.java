import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String txt = input.nextLine();
        int n = txt.length() / 2;

        // Display characters from the second half followed by characters from the first half
        for (int i = 0; i < n; i++) {
            System.out.print(txt.charAt(n + i));
        }

        for (int i = 0; i < n; i++) {
            System.out.print(txt.charAt(n - i - 1));
        }
    }
}