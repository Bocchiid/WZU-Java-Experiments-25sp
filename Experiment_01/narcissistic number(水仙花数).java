import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int a, b, c;
        int temp;

        x = input.nextInt();
        temp = x;
        a = x % 10;
        x /= 10;
        b = x % 10;
        x /= 10;
        c = x % 10;

        if (a * a * a +  b * b * b + c * c * c == temp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
