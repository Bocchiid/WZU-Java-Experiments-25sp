import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id, name, gender;
        double chinese, math, english;

        id = input.next();
        name = input.next();
        gender = input.next();
        chinese = input.nextDouble();
        math = input.nextDouble();
        english = input.nextDouble();

        Student student = new Student(id, name, gender, chinese, math, english);
        student.calScore();
        System.out.println(student);
    }
}

class Student {
    private String id;
    private String name;
    private String gender;
    double chinese;
    double math;
    double english;
    double ave;
    double total;

    public Student(String id, String name, String gender, double chinese, double math, double english) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    private void calTotal() {
        total = chinese + math + english;
    }

    private void calAve() {
        ave = total / 3;
    }

    public void calScore() {
        calTotal();
        calAve();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f %.2f %.2f %.2f %.2f", id, name, gender, chinese, math, english, ave, total);
    }
}
