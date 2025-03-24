import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        double x, y, r;
        Circle circle = new Circle();
        circle.output();
        t = in.nextInt();

        for (int i = 0; i < t; i++) {
            x = in.nextDouble();
            y = in.nextDouble();
            r = in.nextDouble();
            circle.setData(x, y, r);
            circle.output();
        }
    }
}

class Point {
    double x;
    double y;

    Point() {
        x = 0.0;
        y = 0.0;
    }
}

class Circle {
    Point center;
    double radius;

    Circle() {
        center = new Point();
        radius = 0.0;
    }

    void setData(double x, double y, double r) {
        center.x = x;
        center.y = y;
        radius = r;
    }

    void output() {
        System.out.printf("x=%.2f,y=%.2f\n",  center.x, center.y);
        System.out.printf("radius=%.2f\n", radius);
    }
}
