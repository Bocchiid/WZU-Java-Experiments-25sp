import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Computer computer = new Computer();
        computer.run();
        computer.stop();
    }
}

class Cpu {
    Cpu() {
        System.out.println("Constructing a CPU");
    }

    void run() {
        System.out.println("CPU is running");
    }

    void stop() {
        System.out.println("CPU is stopping");
    }
}

class Ram {
    Ram() {
        System.out.println("Constructing a RAM");
    }

    void run() {
        System.out.println("RAM is running");
    }

    void stop() {
        System.out.println("RAM is stopping");
    }
}

class Cdrom {
    Cdrom() {
        System.out.println("Constructing a CDROM");
    }

    void run() {
        System.out.println("CDROM is running");
    }

    void stop() {
        System.out.println("CDROM is stopping");
    }
}

class Computer {
    Cpu  cpu;
    Ram ram;
    Cdrom cdrom;

    Computer() {
        cpu = new Cpu();
        ram = new Ram();
        cdrom = new Cdrom();
        System.out.println("Constructing a COMPUTER");
    }

    void run() {
        System.out.println("COMPUTER is running");
        cpu.run();
        ram.run();
        cdrom.run();
    }

    void stop() {
        cdrom.stop();
        ram.stop();
        cpu.stop();
        System.out.println("COMPUTER is stopping");
    }
}
