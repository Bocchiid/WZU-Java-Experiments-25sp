import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, t;

        a = input.nextInt();
        b = input.nextInt();

        t = a;
        a = b;
        b = t;

        System.out.println(a + " " + b);
    }
}
