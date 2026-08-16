abstract class Animal {
    abstract void sound();

    void eats() {
        System.out.println("Animal eats food");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meaws");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.eats();
    }
}