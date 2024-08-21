import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int y, x, factorial;
        System.out.print("Enter a number \n->");
        y = input.nextInt();
        x = 1;
        factorial = 1;

        while (x <= y) {
            factorial *= x;
            x++;
        }

        System.out.println(factorial);
    }
}
