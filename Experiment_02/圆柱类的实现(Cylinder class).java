import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h, r;

        r = in.nextInt();
        h = in.nextInt();
        Cylinder x = new Cylinder(r, h);
        System.out.printf("%.2f\n",  x.getVolume());
    }
}

class Cylinder {
    int radius;
    int height;

    Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    double getVolume() {
        return 3.14 * radius * radius * height;
    }
}
