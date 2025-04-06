import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int type;
        int r;
        int a, b;
        double s = 0;
        double PI = 3.14;

        type = input.nextInt();

        if (type == 1) {
            r = input.nextInt();
            s = PI * r * r;
        } else if (type == 2) {
            a = input.nextInt();
            b = input.nextInt();
            s = a * b;
        } else if (type == 3) {
            a = input.nextInt();
            s =  a * a;
        }

        System.out.printf("%.2f\n", s);
    }
}
