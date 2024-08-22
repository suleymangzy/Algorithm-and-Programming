
public class Main {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        // Iterate through all two-digit combinations where both digits are prime numbers
        for (int i = 2; i <= 7; i++) {
            for (int j = 2; j <= 7; j++) {
                // Check if both digits are prime numbers
                if ((i == 2 || i == 3 || i == 5 || i == 7) && (j == 2 || j == 3 || j == 5 || j == 7)) {
                    output.append(10 * i + j).append(", ");
                }
            }
        }

        // Remove the trailing comma and space if there is any content
        if (output.length() > 0) {
            output.setLength(output.length() - 2); // Remove last ", "
        }

        // Print the final output
        System.out.println(output.toString());
    }
}