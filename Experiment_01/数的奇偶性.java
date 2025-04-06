import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int x;

        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            x = input.nextInt();

            if (x < 0) {
                x = -x;
            }

            if (x % 2 == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
