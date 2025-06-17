import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        Cuboid cuboid = new Cuboid(a, b, c);
        System.out.println(cuboid.getBottomArea());
        System.out.println(cuboid.getVolume());
    }
}

class Cuboid {
    private int length;
    private int width;
    private int height;
    /** Constructor */
    public Cuboid() {

    }
    /** Overload */
    public Cuboid(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    /** Member Function */
    /** Setter */
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBottomArea() {
        int s = length * width;

        return s;
    }

    public int getVolume() {
        int v = length * width * height;

        return v;
    }
}
