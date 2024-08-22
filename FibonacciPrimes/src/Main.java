import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int numberOfTerms = input.nextInt();

        int f1 = 1, f2 = 1;
        int primeCount = 0;

        while (primeCount < numberOfTerms) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

            boolean isPrime = true;
            if (f3 <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(f3); i++) {
                    if (f3 % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeCount++;
                System.out.print(f3 + ", ");
            }
        }
    }
}