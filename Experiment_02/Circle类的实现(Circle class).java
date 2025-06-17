import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, radius;

        x = in.nextInt();
        y = in.nextInt();
        radius = in.nextInt();

        Circle circle = new Circle(radius, x, y);

        circle.output();
        System.out.println("Diameter=" + circle.calDiameter());
        System.out.printf("Area=%.1f\n", circle.calArea());
        System.out.printf("Perimeter=%.1f\n", circle.calPerimeter());
    }
}

class Circle {
    private int radius;
    private int x;
    private int y;

    public Circle() {
        radius = 1;
        x = 0;
        y = 0;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int calDiameter() {
        return 2 * getRadius();
    }

    public double calArea() {
        double PI = 3.14;

        double s = PI * getRadius() * getRadius();

        return s;
    }

    public double calPerimeter() {
        double PI = 3.14;

        double c = PI * calDiameter();

        return c;
    }

    public void output() {
        System.out.printf("Center=(%d,%d) and Radius=%d\n", x, y, radius);
    }
}
