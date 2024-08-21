public class Main {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int s = i + j;
                if (s == 1 || s == 2 || s == 3 || s == 5 || s == 8 || s == 13) {
                    output.append(10 * i + j).append(",");
                }
            }
        }
        if (output.length() > 0) {
            output.setLength(output.length() - 1);
        }
        System.out.println(output);
    }
}
