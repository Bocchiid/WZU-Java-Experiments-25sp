import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String op;
        String id, name, gender;
        double Chinese, Math, English;

        Student stu[] = new Student[101];
        int size = 0;

        op = input.next();

        while (true) {
            if (op.equals("INSERT")) {
                id = input.next();
                name = input.next();
                gender = input.next();
                Chinese = input.nextDouble();
                Math = input.nextDouble();
                English = input.nextDouble();

                stu[size] = new Student(id, name, gender, Chinese, Math, English);
                stu[size].calTotal();
                stu[size].calAverage();

                System.out.println(stu[size]);
                size += 1;
            } else if (op.equals("LIST")) {
                Student.sort(stu, size);

                for (int i = 0; i < size; i++) {
                    System.out.println(stu[i]);
                }
            } else if (op.equals("QUIT")) {
                break;
            }

            op = input.next();
        }

        System.out.println("Good bye!");
    }
}

interface Comparable {
    int compareTo(Student that);
}

class Student implements Comparable {
    String id;
    String name;
    String gender;
    double Chinese;
    double Math;
    double English;
    double average;
    double total;

    Student() {

    }

    Student(String id, String name, String gender, double Chinese, double Math, double English) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;
    }

    public void calTotal() {
        total = Chinese + Math + English;
    }

    public void calAverage() {
        average = total / 3.0;
    }

    public String toString() {
        return String.format("%s %s %s %.2f %.2f %.2f %.2f %.2f", id, name, gender, Chinese, Math, English, average, total);
    }

    public int compareTo(Student that) {
        return this.id.compareTo(that.id);
    }

    public static void sort(Student stu[], int size) {
        Arrays.sort(stu, 0, size, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
