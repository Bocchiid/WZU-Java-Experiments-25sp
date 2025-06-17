import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        double length, width;

        name = in.next();
        length = in.nextDouble();
        width = in.nextDouble();
        Rectangle rectangle1 = new Rectangle(name, length, width);

        name = in.next();
        length = in.nextDouble();
        width = in.nextDouble();
        Rectangle rectangle2 = new Rectangle(name, length, width);

        double radius;

        name = in.next();
        radius = in.nextDouble();
        Circle circle1 = new Circle(name, radius);

        name = in.next();
        radius = in.nextDouble();
        Circle circle2 = new Circle(name, radius);

        System.out.println(GeometricObject.max(rectangle1, rectangle2));
        System.out.println(GeometricObject.max(circle1, circle2));
    }
}

interface Comparable {
    public double calArea();
}

/** Placeholder(占位符) */
abstract class GeometricObject implements Comparable {
    String name;

    public GeometricObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Comparable max(Comparable o1, Comparable o2) {
        if (o1.calArea()  > o2.calArea()) {
            return o1;
        } else {
            return o2;
        }
    }
}

class Rectangle extends GeometricObject {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calArea() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.2f %.2f", getName(), getLength(), getWidth(), calArea());
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.2f", getName(), getRadius(), calArea());
    }
}
