import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1, side2, side3;

        System.out.println("Enter the length of the 1st side of the triangle:");
        side1 = input.nextInt();

        System.out.println("Enter the length of the 2nd side of the triangle:");
        side2 = input.nextInt();

        System.out.println("Enter the length of the 3rd side of the triangle:");
        side3 = input.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("EQUILATERAL TRIANGLE");
        } else if ((side1 != side2 && side1 == side3) ||
                (side1 == side2 && side1 != side3) ||
                (side2 == side3 && side2 != side1)) {
            System.out.println("ISOSCELES TRIANGLE");
        } else {
            System.out.println("SCALENE TRIANGLE");
        }
    }
}