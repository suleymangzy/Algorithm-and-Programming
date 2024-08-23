import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value in meters:");
        double meters = input.nextDouble();

        System.out.println("Select the unit to convert to:\n1-cm\n2-mm\n3-dm\n4-km");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(meters * 100 + " cm");
                break;
            case 2:
                System.out.println(meters * 1000 + " mm");
                break;
            case 3:
                System.out.println(meters * 10 + " dm");
                break;
            case 4:
                System.out.println(meters / 1000 + " km");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;
        }
    }
}