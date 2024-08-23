
public class Main {
    public static void main(String[] args) {
        // Iterate over possible values for i, j, and k
        for (int i = 1; i <= 50; i++) {
            for (int j = i; j <= 50; j++) {
                for (int k = j; k <= 50; k++) {
                    // Check if the current values of i, j, and k satisfy the Markov number condition
                    if ((i * i + j * j + k * k) == (3 * i * j * k)) {
                        System.out.println(i + "," + j + "," + k);
                    }
                }
            }
        }
    }
}