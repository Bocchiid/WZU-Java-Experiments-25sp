import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Object> arrayList = new ArrayList<>();

        double loan1 = input.nextDouble();
        Loan loan = new Loan(loan1);

        String date1 = input.next();
        Date date = new Date(date1);

        String string = input.next();

        String frameName1 = input.next();
        Frame frame = new Frame(frameName1);

        double radius = input.nextDouble();
        Circle circle = new Circle(radius);

        arrayList.add(loan);
        arrayList.add(date);
        arrayList.add(string);
        arrayList.add(frame);
        arrayList.add(circle);
        /** 1.传统的for循环 */
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
        /** 2.范围增强型for循环 */
//        for (Object it : arrayList) {
//            System.out.println(it);
//        }
        /** 3.迭代器循环 */
        Iterator<Object> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Loan {
    double loan;

    public Loan(double loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return String.format("Loan: %.2f", loan);
    }
}

class Date {
    String date;

    public Date(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date: " + date;
    }
}

class Frame {
    String frameName;

    public Frame(String frameName) {
        this.frameName = frameName;
    }

    @Override
    public String toString() {
        return "Frame: " + frameName;
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: %.2f", radius);
    }
}
