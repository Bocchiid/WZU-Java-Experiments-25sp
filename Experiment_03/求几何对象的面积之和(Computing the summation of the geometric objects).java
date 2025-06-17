import java.util.Iterator;
import java.util.Scanner;

public class Main {
    /** 自定义函数 */
//    /** static 方法是静态的, 方法是属于类的 */
//    public static double sumArea(GeometricObject[] a) {
//        double sumArea = 0;
//
//        for (GeometricObject it : a) {
//            sumArea += it.calArea();
//        }
//
//        return sumArea;
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GeometricObject[] a = new GeometricObject[4];

        for (int i = 0; i < 2; i++) {
            double length, width;

            length = input.nextDouble();
            width = input.nextDouble();

            a[i] = new Rectangle(length, width);
        }

        for (int i = 2; i < 4; i++) {
            double radius;

            radius = input.nextDouble();

            a[i] = new Circle(radius);
        }

        System.out.printf("%.2f\n", GeometricObject.sumArea(a));
    }
}

abstract class GeometricObject {
    public GeometricObject() {

    }

    public abstract double calArea();
    /** static 方法是静态的, 方法是属于类的 */
    public static double sumArea(GeometricObject[] a) {
        double sumArea = 0;

        for (GeometricObject it : a) {
            sumArea += it.calArea();
        }

        return sumArea;
    }
}

class Rectangle extends GeometricObject {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super();
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
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
