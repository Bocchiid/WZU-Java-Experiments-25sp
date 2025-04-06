import java.util.Scanner;

public class Main {
    public static boolean isTriangle(double a, double b, double c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculateArea(double a, double b, double c)
    {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        double a, b, c;

        t = input.nextInt();

        for (int i = 0; i < t; i++) {
            a =  input.nextDouble();
            b =  input.nextDouble();
            c =  input.nextDouble();

            if (isTriangle(a, b, c)) {
                System.out.printf("%.0f %.0f\n", calculatePerimeter(a, b, c), calculateArea(a, b, c));
            } else {
                System.out.println("Not a triangle.");
            }
        }
    }
}
