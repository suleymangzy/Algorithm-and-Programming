import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string consisting of uppercase letters only:");
        String txt = input.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            System.out.print(txt.charAt(i) + "->");
            for (int j = 0; j < ((int)txt.charAt(i) - 64); j++) {
                System.out.print("*");
            }
            System.out.println("    ");
        }
    }
}