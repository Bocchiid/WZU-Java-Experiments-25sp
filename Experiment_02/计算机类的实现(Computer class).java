public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
        computer.stop();
    }
}

class Cpu {
    public Cpu() {
        System.out.println("Constructing a CPU");
    }

    public void run() {
        System.out.println("CPU is running");
    }

    public void stop() {
        System.out.println("CPU is stopping");
    }
}

class Ram {
    public Ram() {
        System.out.println("Constructing a RAM");
    }

    public void run() {
        System.out.println("RAM is running");
    }

    public void stop() {
        System.out.println("RAM is stopping");
    }
}

class Cdrom {
    public Cdrom() {
        System.out.println("Constructing a CDROM");
    }

    public void run() {
        System.out.println("CDROM is running");
    }

    public void stop() {
        System.out.println("CDROM is stopping");
    }
}

class Computer {
    Cpu cpu;
    Ram ram;
    Cdrom cdrom;

    public Computer() {
        cpu = new Cpu();
        ram = new Ram();
        cdrom = new Cdrom();
        System.out.println("Constructing a COMPUTER");
    }

    public void run() {
        System.out.println("COMPUTER is running");
        cpu.run();
        ram.run();
        cdrom.run();
    }

    public void stop() {
        cdrom.stop();
        ram.stop();
        cpu.stop();
        System.out.println("COMPUTER is stopping");
    }
}
