class Rectangle extends Shape {
    double length;
    double width;

    Rectangle() {

    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double calArea() {
        return 3.14 * radius * radius;
    }
}
