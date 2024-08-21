import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a value for 'a':");
        int a = input.nextInt();
        int b = 0;

        while (a >= 0) {
            if (a % 2 != 0) {
                b = b + a;
            }
            System.out.println("Please enter another value for 'a':");
            a = input.nextInt();
        }

        System.out.println("The sum of odd values is: " + b);

    }
}