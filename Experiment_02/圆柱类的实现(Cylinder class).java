import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int radius, height;
        radius = in.nextInt();
        height = in.nextInt();

        Cylinder cylinder = new Cylinder(radius, height);
        System.out.printf("%.2f\n", cylinder.getVolume());
    }
}

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double getVolume() {
        double PI = 3.14;

        double v = PI * getRadius() * getRadius() * getHeight();

        return v;
    }
}
