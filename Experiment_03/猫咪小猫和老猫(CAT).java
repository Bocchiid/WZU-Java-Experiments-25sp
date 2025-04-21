public class Main {
    public static void main(String[] args) {
        Cat[] catfamily = new Cat[3];

        catfamily[0] = new OldCat("HuangLao");
        catfamily[1] = new AdultCat("LaoMei");
        catfamily[2] = new YoungCat("XiaoLi");

        for (int i = 0; i < 3; i++) {
            catfamily[i].show();
            catfamily[i].move();
            catfamily[i].sound();

            System.out.println();
        }
    }
}

abstract class Cat {
    String name;

    Cat() {

    }

    Cat(String name) {
        this.name = name;
    }

    public abstract void move();
    public abstract void sound();
    public abstract void show();
}

class YoungCat extends Cat {
    YoungCat() {

    }

    YoungCat(String name) {
        super(name);
    }

    public void move() {
        System.out.println("I like jumping.");
    }

    public void sound() {
        System.out.println("mie mie!");
    }

    public void show() {
        System.out.printf("I am %s,I am a young cat!\n", name);
    }
}

class AdultCat extends Cat {
    AdultCat() {

    }

    AdultCat(String name) {
        super(name);
    }

    public void move() {
        System.out.println("I can move quickly.");
    }

    public void sound() {
        System.out.println("mie mie!");
    }

    public void show() {
        System.out.printf("I am %s,I am a cat!\n", name);
    }
}

class OldCat extends Cat {
    OldCat() {

    }

    OldCat(String name) {
        super(name);
    }

    public void move() {
        System.out.println("I move slowly.");
    }

    public void sound() {
        System.out.println("miem miem!");
    }

    public void show() {
        System.out.printf("I am %s,I am a old cat!\n", name);
    }
}
