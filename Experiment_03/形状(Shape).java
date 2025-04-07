import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double r, h;
        double a, b, c;

        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            r = input.nextDouble();
            h = input.nextDouble();
            Cylinder obj0 = new Cylinder(r, h);
            System.out.printf("%.2f %.2f\n", obj0.getArea(), obj0.getVolume());

            r = input.nextDouble();
            Sphere obj1 = new Sphere(r);
            System.out.printf("%.2f %.2f\n", obj1.getArea(), obj1.getVolume());

            a = input.nextDouble();
            Cube obj2 = new Cube(a);
            System.out.printf("%.2f %.2f\n", obj2.getArea(), obj2.getVolume());

            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
            Cuboid obj3 = new Cuboid(a, b, c);
            System.out.printf("%.2f %.2f\n", obj3.getArea(), obj3.getVolume());
        }
    }
}

abstract class Shape {
    Shape() {

    }

    public abstract double getArea();
    public abstract double getVolume();
}

class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder() {

    }

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getArea() {
        return 2.0 * 3.14 * radius * height + 2.0 * 3.14* radius * radius;
    }

    public double getVolume() {
        return 3.14 * radius * radius * height;
    }
}

class Sphere extends Shape {
    double radius;

    Sphere() {

    }

    Sphere(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 4.0 * 3.14 * radius * radius;
    }

    public double getVolume() {
        return 4.0 / 3.0 * 3.14 * radius * radius * radius;
    }
}

class Cube extends Shape {
    double a;

    Cube() {

    }

    Cube(double a) {
        this.a = a;
    }

    public double getArea() {
        return 6.0 * a * a;
    }

    public double getVolume() {
        return a * a * a;
    }
}

class Cuboid extends Shape {
    double a;
    double b;
    double c;

    Cuboid() {

    }

    Cuboid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        return 2.0 * a * b + 2.0 * a * c + 2.0 * b * c;
    }

    public double getVolume() {
        return a * b * c;
    }
}
