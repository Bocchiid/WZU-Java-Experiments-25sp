import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 1; i <= t; i++) {
            double r = in.nextDouble();

            Cube cube = new Cube(r);
            cube.calVolume();
            cube.calArea();

            System.out.print("obj" + i + " ");
            cube.display();
        }
    }
}

class Cube {
    private double edge;
    private double volume;
    private double area;
    /** Constructor */
    public Cube() {

    }
    /** Overload */
    public Cube(double edge) {
        this.edge = edge;
    }
    /** Member Function */
    public void calVolume() {
        volume = edge * edge * edge;
    }

    public void calArea() {
        area = 6 * edge * edge;
    }

    public void display() {
        System.out.printf("Volume:%.2f; Area:%.2f\n", volume, area);
    }
}
