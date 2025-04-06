import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int x;
        boolean flag = true;

        for (a = 1; a < 10; a++) {
            for (b = 1; b < 10; b++) {
                if (a == b) {
                    continue;
                }

                x = 1000 * a + 100 * a + 10 * b + 1 * b;

                if (Math.sqrt(x) - (int)Math.sqrt(x) == 0) {
                    System.out.println(x);
                    flag = false;
                    break;
                }
            }
        }
    }
}
