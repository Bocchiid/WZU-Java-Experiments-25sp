import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            double radius, height;

            radius = in.nextDouble();
            height = in.nextDouble();

            Cylinder cylinder = new Cylinder(radius, height);
            System.out.printf("%.2f %.2f\n", cylinder.calArea(), cylinder.calVolume());

            radius = in.nextDouble();

            Sphere sphere = new Sphere(radius);
            System.out.printf("%.2f %.2f\n", sphere.calArea(), sphere.calVolume());

            double edge;

            edge = in.nextDouble();

            Cube cube = new Cube(edge);
            System.out.printf("%.2f %.2f\n", cube.calArea(), cube.calVolume());

            double length, width, newHeight;

            length = in.nextDouble();
            width = in.nextDouble();
            newHeight = in.nextDouble();

            Cuboid cuboid = new Cuboid(length, width, newHeight);
            System.out.printf("%.2f %.2f\n", cuboid.calArea(), cuboid.calVolume());
        }
    }
}

abstract class Shape {
    public Shape() {

    }

    public abstract double calArea();
    public abstract double calVolume();
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calArea() {
        double PI = 3.14;

        double s = 2 * PI * getRadius() * getRadius() + 2 * PI * getRadius() * getHeight();

        return s;
    }

    @Override
    public double calVolume() {
        double PI = 3.14;

        double v = PI * getRadius() * getRadius() * getHeight();

        return v;
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calArea() {
        double PI = 3.14;

        double s = 4 * PI * getRadius() * getRadius();

        return s;
    }

    @Override
    public double calVolume() {
        double PI = 3.14;

        double v = 4.0 / 3.0 * PI * getRadius() * getRadius() * getRadius();

        return v;
    }
}

class Cube extends Shape {
    private double edge;

    public Cube(double edge) {
        super();
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double calArea() {
        return 6 * getEdge() * getEdge();
    }

    @Override
    public double calVolume() {
        return getEdge() * getEdge() * getEdge();
    }
}

class Cuboid extends Shape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calArea() {
        return 2 * getLength() * getWidth() + 2 * getLength() * getHeight() + 2 * getWidth() * getHeight();
    }

    @Override
    public double calVolume() {
        return getLength() * getWidth() * getHeight();
    }
}
