import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        Circle circle = new Circle();
        circle.output();

        for (int i = 0; i < t; i++) {
            double x, y, radius;

            x = in.nextDouble();
            y = in.nextDouble();
            radius = in.nextDouble();

            circle = new Circle(x, y, radius);
            circle.output();
        }
    }
}

class Point {
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    Point p;
    private double radius;

    public Circle() {
        p = new Point();
        radius = 0;
    }

    public Circle(double x, double y, double radius) {
        p = new Point(x,y);
        this.radius = radius;
    }

    public Point getP() {
        return p;
    }

    public double getRadius() {
        return radius;
    }

    public void output() {
        System.out.printf("x=%.2f,y=%.2f\n", getP().getX(), getP().getY());
        System.out.printf("radius=%.2f\n", getRadius());
    }
}
