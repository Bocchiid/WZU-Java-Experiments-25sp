import java.util.Iterator;
import java.util.Vector;

public class Main{
    public static void main(String[] args){
        Employee e1 = new Employee("zhangsan", 20, "s101", "d01", 3);
        e1.print();
        System.out.println();

        Employee e2 = new Employee("lisi", 20, "s202", "d02", 4);
        e2.print();
        System.out.println();

        e2 = new Employee("maliu", 20, "s102", "d01", 5);

        Manager m1 = new Manager("wangwu", 30, "s100", "d01", 9);

        m1.getSubordinates().addElement(e1);
        m1.getSubordinates().addElement(e2);
        m1.print();
        System.out.println();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Person {
    String empId;
    String department;
    int level;

    public Employee(String name, int age, String empId, String department, int level) {
        super(name, age);
        this.empId = empId;
        this.department = department;
        this.level = level;
    }

    public String getEmpId() {
        return empId;
    }

    public String getDepartment() {
        return department;
    }

    public int getLevel() {
        return level;
    }

    public void print() {
        System.out.println("I am a Employee");
        System.out.printf("My name is %s,I am %d years old.\n", getName(), getAge());
        System.out.printf("I am a %d level Employee.My employeeNumber is %s.I am working in %s\n", getLevel(), getEmpId(), getDepartment());
    }
}

class Manager extends Employee {
    Vector<Employee> a;

    public Manager(String name, int age, String empId, String department, int level) {
        super(name, age, empId, department, level);
        a = new Vector<>();
    }

    public Vector<Employee> getSubordinates() {
        return a;
    }

    @Override
    public void print() {
        System.out.println("I am a Manager");
        System.out.printf("My name is %s,I am %d years old.\n", getName(), getAge());
        System.out.printf("I am a %d level Employee.My employeeNumber is %s.I am working in %s\n", getLevel(), getEmpId(), getDepartment());
        System.out.println("My subordinate has:");

        Iterator<Employee> iterator = a.iterator();
        boolean flag = true;

        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();

            if (!flag) {
                System.out.print(",");
            }

            System.out.print(employee.getName());
            flag = false;
        }

        System.out.print(".");
    }
}
