import java.util.Scanner;

public class Main {
    public static double sumArea(GeometricObject a[]) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i].computeArea();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GeometricObject a[] = new GeometricObject[4];
        double length, width;
        double radius;

        for (int i = 0; i < 2; i++) {
            length = input.nextDouble();
            width = input.nextDouble();
            a[i] = new Rectangle(length, width);
        }

        for (int i = 2; i < 4; i++) {
            radius = input.nextDouble();
            a[i] = new Circle(radius);
        }

        System.out.printf("%.2f\n", sumArea(a));
    }
}

abstract class GeometricObject {
    GeometricObject() {

    }

    public abstract double computeArea();
}

class Rectangle extends GeometricObject {
    double length;
    double width;

    Rectangle() {

    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double computeArea() {
        return length * width;
    }
}

class Circle extends GeometricObject {
    double radius;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
