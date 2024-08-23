import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int x = input.nextInt();

        int t1 = 1, t2 = 1, t3 = 2;
        StringBuilder output = new StringBuilder();

        output.append(t1).append(",");
        output.append(t2).append(",");
        output.append(t3);

        for (int i = 1; i <= x - 3; i++) {
            int t4 = t1 + t2 + t3;
            output.append(",").append(t4);
            t1 = t2;
            t2 = t3;
            t3 = t4;
        }

        System.out.println(output.toString());
    }
}