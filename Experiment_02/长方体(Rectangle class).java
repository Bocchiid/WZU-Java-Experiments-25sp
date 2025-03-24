import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        Cuboid x = new Cuboid(a, b, c);
        x.getBottomArea();
        x.getVolume();
    }
}

class Cuboid {
    int length;
    int width;
    int height;

    Cuboid(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void getBottomArea() {
        System.out.println(length * width);
    }

    void getVolume() {
        System.out.println(length * width * height);
    }
}
