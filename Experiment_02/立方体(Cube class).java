import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        double edge;

        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            edge = in.nextDouble();
            Cube x = new Cube(edge);
            x.calVolume();
            x.calArea();
            System.out.printf("obj%d ", i);
            x.display();
        }
    }
}

class Cube {
    private double edge;
    private double volume;
    private double area;

    Cube(double edge) {
        this.edge = edge;
    }

    void calVolume() {
        volume = edge * edge * edge;
    }

    void  calArea() {
        area = edge * edge * 6;
    }

    void display() {
        System.out.printf("Volume:%.2f; Area:%.2f\n",  volume, area);
    }
}
