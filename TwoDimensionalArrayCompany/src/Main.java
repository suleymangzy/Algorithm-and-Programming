import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of companies:");
        int n = input.nextInt();
        int[][] earnings = new int[n][12];

        // Generate and display monthly earnings for each company
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 12; j++) {
                earnings[i][j] = random.nextInt(1000000);
                System.out.println("Company " + (i + 1) + ", Month " + (j + 1) + ": " + earnings[i][j]);
            }
        }

        // Calculate and display the annual average earnings for each company
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 12; j++) {
                total += earnings[i][j];
            }
            System.out.println("Company " + (i + 1) + "'s annual average earnings: " + (total / 12));
        }

        // Find and display the highest and lowest earnings of each company
        for (int i = 0; i < n; i++) {
            int highest = earnings[i][0], highestMonth = 0;
            int lowest = earnings[i][0], lowestMonth = 0;
            for (int j = 0; j < 12; j++) {
                if (earnings[i][j] > highest) {
                    highest = earnings[i][j];
                    highestMonth = j;
                }
                if (earnings[i][j] < lowest) {
                    lowest = earnings[i][j];
                    lowestMonth = j;
                }
            }
            System.out.println("Company " + (i + 1) + " had the highest earnings of " + highest + " in month " + (highestMonth + 1) + ".");
            System.out.println("Company " + (i + 1) + " had the lowest earnings of " + lowest + " in month " + (lowestMonth + 1) + ".");
        }

        // Find and display the highest and lowest earnings for each month across all companies
        for (int i = 0; i < 12; i++) {
            int highestEarnings = earnings[0][i];
            int highestCompany = 0;
            int lowestEarnings = earnings[0][i];
            int lowestCompany = 0;
            for (int j = 0; j < n; j++) {
                if (highestEarnings < earnings[j][i]) {
                    highestEarnings = earnings[j][i];
                    highestCompany = j;
                }
                if (lowestEarnings > earnings[j][i]) {
                    lowestEarnings = earnings[j][i];
                    lowestCompany = j;
                }
            }
            System.out.println("In month " + (i + 1) + ", the company with the highest earnings is Company " + (highestCompany + 1) + " with " + highestEarnings + ".");
            System.out.println("In month " + (i + 1) + ", the company with the lowest earnings is Company " + (lowestCompany + 1) + " with " + lowestEarnings + ".");
        }
    }
}