import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string consisting of lowercase letters only:");
        String str = input.nextLine();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelCount = 0;

        // Count vowels and consonants
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            for (char vowel : vowels) {
                if (currentChar == vowel) {
                    vowelCount++;
                    break;
                }
            }
        }

        int consonantCount = str.length() - vowelCount;
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        // Separate vowels and consonants
        char[] vowelArray = new char[vowelCount];
        char[] consonantArray = new char[consonantCount];
        int vowelIndex = 0, consonantIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isVowel = false;
            for (char vowel : vowels) {
                if (currentChar == vowel) {
                    isVowel = true;
                    break;
                }
            }
            if (isVowel) {
                vowelArray[vowelIndex++] = currentChar;
            } else {
                consonantArray[consonantIndex++] = currentChar;
            }
        }

        // Print vowel and consonant arrays
        System.out.print("Word with vowels: ");
        for (char c : vowelArray) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("Word with consonants: ");
        for (char c : consonantArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}