import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        a = input.nextInt();
        b = input.nextInt();

        System.out.printf("%d %d %d %d\n", a + b, a * b, a - b, a / b);
    }
}
