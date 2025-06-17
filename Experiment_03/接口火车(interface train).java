class Car implements Auto {
    public Car() {

    }

    @Override
    public void move() {
        System.out.println("I am running very fast.");
    }

    @Override
    public void stop() {
        System.out.println("I am stopping.");
    }

    @Override
    public void dudu() {
        System.out.println("I am a car!Get out Every one!");
    }
}

class Truck implements Auto {
    public Truck() {

    }

    @Override
    public void move() {
        System.out.println("I am running very smoothly.");
    }

    @Override
    public void stop() {
        System.out.println("I am slowly stopping.");
    }

    @Override
    public void dudu() {
        System.out.println("I am a big Auto!Get out Every one and small car!");
    }
}

class FireTruck extends Truck implements Sprinkler {
    public FireTruck() {

    }

    @Override
    public void watering() {
        System.out.println("I am watering,No fire!");
    }
}
