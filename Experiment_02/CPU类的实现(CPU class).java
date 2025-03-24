class Cpu {
    int rank;
    int frequency;
    double voltage;

    Cpu(int rank, int frequency, double voltage) {
        System.out.println("Constructing a CPU");
        this.rank = rank;
        this.frequency = frequency;
        this.voltage = voltage;
    }

    void run() {
        System.out.println("CPU is running");
    }

    void stop() {
        System.out.println("CPU is stopping");
    }
}
