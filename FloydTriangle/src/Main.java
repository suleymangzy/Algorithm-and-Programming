import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numRows = input.nextInt();
        System.out.println("FLOYD'S TRIANGLE");

        int number = 1;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + ", ");
                number++;
            }
            System.out.println();
        }
    }
}