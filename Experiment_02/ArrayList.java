import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double loan;
        String date;
        String s;
        String frameName;
        double radius;

        ArrayList<Object> list = new ArrayList<>();

        loan = input.nextDouble();
        Loan a = new Loan(loan);
        list.add(a);

        date = input.next();
        Date b =  new Date(date);
        list.add(b);

        s = input.next();
        list.add(s);

        frameName = input.next();
        Frame c =  new Frame(frameName);
        list.add(c);

        radius = input.nextDouble();
        Circle circle = new Circle(radius);
        list.add(circle);

        for (int i = 0; i<list.size();i++) {
            System.out.println(list.get(i).toString());
        }
    }
}

class Loan {
    double loan;

    Loan(double loan) {
        this.loan = loan;
    }

    public String toString() {
        return String.format("Loan: %.2f", loan);
    }
}

class Date {
    String date;

    Date(String date) {
        this.date = date;
    }

    public String toString() {
        return String.format("Date: %s", date);
    }
}

class Frame {
    String franName;

    Frame(String franName) {
        this.franName = franName;
    }

    public String toString() {
        return String.format("Frame: %s", franName);
    }
}

class Circle {
    double  radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("Circle: %.2f", radius);
    }
}
