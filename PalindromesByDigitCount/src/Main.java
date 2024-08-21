import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of digits:");
        int n = input.nextInt();
        double count = Math.pow(9 * 10, (n - 1) / 2);
        System.out.println("There are " + count + " palindromic numbers with " + n + " digits.");
    }
}