import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, r;

        x = in.nextInt();
        y = in.nextInt();
        r = in.nextInt();
        Circle circle = new Circle(x, y, r);
        circle.output();
        System.out.printf("Diameter=%d\n", circle.calDiameter());
        System.out.printf("Area=%.1f\n", circle.calArea());
        System.out.printf("Perimeter=%.1f\n", circle.calPerimeter());
    }
}

class Circle {
    private int radius;
    private int x;
    private int y;

    Circle() {
        radius = 1;
        x = 0;
        y = 0;
    }

    Circle(int x, int y, int r) {
        this.radius = r;
        this.x = x;
        this.y = y;
    }

    int calDiameter() {
        return  2 * this.radius;
    }

    double calArea() {
        return 3.14 * this.radius * this.radius;
    }

    double calPerimeter() {
        return 3.14 * this.calDiameter();
    }

    void output() {
        System.out.printf("Center=(%d,%d) and Radius=%d\n", x, y, radius);
    }
}
