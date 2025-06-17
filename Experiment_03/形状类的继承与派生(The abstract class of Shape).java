class Rectangle extends Shape {
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

    @Override
    public double calArea() {
        return getWidth() * getLength();
    }
}

class Circle extends Shape {
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
        double PI = 3.14;

        return PI * getRadius() * getRadius();
    }
}
