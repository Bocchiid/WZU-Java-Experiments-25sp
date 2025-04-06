import java.util.Scanner;

public class Main {
    public static int times(int x, int y) {
        return x * y;
    }

    public static double times(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double c, d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextDouble();
        d = input.nextDouble();
        System.out.println(times(a, b));
        System.out.printf("%.4f\n", times(c, d));
    }
}
