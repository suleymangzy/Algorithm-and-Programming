import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase with all lowercase letters:");
        String text = input.nextLine();
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            // Determine the position in the 4-character cycle
            int positionInCycle = counter % 4;

            if (positionInCycle < 2) {
                // Convert to uppercase for the first two characters in each cycle
                System.out.print(Character.toUpperCase(text.charAt(i)));
            } else {
                // Convert to lowercase for the next two characters in each cycle
                System.out.print(Character.toLowerCase(text.charAt(i)));
            }

            counter++;
        }
    }
}