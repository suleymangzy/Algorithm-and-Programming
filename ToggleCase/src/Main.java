import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string with mixed case letters:");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                System.out.print(Character.toLowerCase(currentChar));
            } else {
                System.out.print(Character.toUpperCase(currentChar));
            }
        }
    }
}