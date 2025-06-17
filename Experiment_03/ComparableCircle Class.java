import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r1, r2;

        r1 = in.nextDouble();
        r2 = in.nextDouble();

        ComparableCircle circle1 = new ComparableCircle(r1);
        ComparableCircle circle2 = new ComparableCircle(r2);

        double maxArea = 0;

        if (circle1.compareTo(circle2) == 1) {
            maxArea = circle1.calArea();
        } else {
            maxArea = circle2.calArea();
        }

        System.out.printf("The max circle's area is %.2f\n", maxArea);
    }
}

interface Comparable {
    public int compareTo(ComparableCircle that);
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calArea() {
        return Math.PI * getRadius() * getRadius();
    }
}

class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(ComparableCircle that) {
        if (this.getRadius() > that.getRadius()) {
            return 1;
        } else if (getRadius() == that.getRadius()) {
            return 0;
        } else {
            return -1;
        }
    }
}
