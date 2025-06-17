import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side1, side2, side3;
        String color, filled;

        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        color = input.next();
        filled = input.next();

        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println(triangle);
        System.out.printf("Area=%.2f\n", triangle.getArea());
        System.out.printf("Perimeter=%.2f\n", triangle.getPerimeter());
    }
}

abstract class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject(String color, String filled) {
        this.color = color;

        if (filled.equals("true")) {
            this.filled = true;
        } else {
            this.filled = false;
        }
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super("No Color", "false");
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(String color, String filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double p = (getSide1() + getSide2() + getSide3()) / 2;

        double s = Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));

        return s;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    @Override
    public String toString() {
        return String.format("Triangle: side1=%.1f side2=%.1f side3=%.1f color=%s filled=" + isFilled(),getSide1(), getSide2(), getSide3(), getColor());
    }
}
