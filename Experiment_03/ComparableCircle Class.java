import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r1, r2;

        r1 = input.nextDouble();
        r2 = input.nextDouble();

        ComparableCircle c1 = new ComparableCircle(r1);
        ComparableCircle c2 = new ComparableCircle(r2);

        if (c1.compareTo(c2)) {
            System.out.printf("The max circle's area is %.2f\n", c1.calArea());
        } else {
            System.out.printf("The max circle's area is %.2f\n", c2.calArea());
        }
    }
}

interface Comparable {
    public abstract boolean compareTo(ComparableCircle a);
}

class Circle {
    double radius;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double calArea() {
        return Math.PI * radius * radius;
    }
}

class ComparableCircle extends Circle implements Comparable {
    ComparableCircle() {

    }

    ComparableCircle(double radius) {
        super(radius);
    }

    public boolean compareTo(ComparableCircle a) {
        if (this.calArea() > a.calArea()) {
            return true;
        } else {
            return false;
        }
    }
}
