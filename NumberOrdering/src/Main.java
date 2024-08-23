import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter the first number:");
        a = input.nextInt();

        System.out.println("Enter the second number:");
        b = input.nextInt();

        System.out.println("Enter the third number:");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("First number > Second number > Third number");
            } else {
                System.out.println("First number > Third number > Second number");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Second number > First number > Third number");
            } else {
                System.out.println("Second number > Third number > First number");
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println("Third number > First number > Second number");
            } else {
                System.out.println("Third number > Second number > First number");
            }
        }
    }
}