import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double a, b, r;

        name = input.next();
        a = input.nextDouble();
        b = input.nextDouble();
        GeometricObject o1 = new Rectangle(name, a, b);

        name = input.next();
        a = input.nextDouble();
        b = input.nextDouble();
        GeometricObject o2 = new Rectangle(name, a, b);

        GeometricObject bigger = GeometricObject.max(o1, o2);
        System.out.println(bigger);

        name = input.next();
        r = input.nextDouble();
        o1 = new Circle(name, r);

        name = input.next();
        r = input.nextDouble();
        o2 = new Circle(name, r);

        bigger = GeometricObject.max(o1, o2);
        System.out.println(bigger);
    }
}

interface Comparable<GeometricObject> {

}

abstract class GeometricObject implements Comparable<GeometricObject> {
    String name;

    GeometricObject() {

    }

    GeometricObject(String name) {
        this.name = name;
    }

    public abstract double calArea();

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.calArea() > o2.calArea()) {
            return o1;
        } else {
            return o2;
        }
    }
}

class Rectangle extends GeometricObject {
    double length;
    double width;

    Rectangle() {

    }

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double calArea() {
        return length * width;
    }

    public String toString() {
        return String.format("%s %.2f %.2f %.2f", name, length, width, this.calArea());
    }
}

class Circle extends GeometricObject {
    double radius;

    Circle() {

    }

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return String.format("%s %.2f %.2f", name, radius, this.calArea());
    }
}
