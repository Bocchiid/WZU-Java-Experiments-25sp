import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        String color;
        boolean filled;

        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        color = input.next();
        filled = input.nextBoolean();

        Triangle a = new Triangle(side1, side2, side3, color, filled);
        System.out.println(a);
        System.out.printf("Area=%.2f\n", a.getArea());
        System.out.printf("Perimeter=%.2f\n", a.getPerimeter());
    }
}

class GeometricObject {
    String color;
    boolean filled;

    GeometricObject() {

    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
}

class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    Triangle() {

    }

    Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this(side1, side2, side3);
        this.color = color;
        this.filled = filled;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2.0;
        double s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

        return s;
    }

    public String toString() {
        return "Triangle: side1=" + side1 + " side2=" + side2 + " side3=" + side3 +
                " color=" + color + " filled=" + filled;
    }
}
