package AbstractClassWithConstructor;

abstract class Animal {
    Animal() {
        System.out.println("Animal Constractor");
    }

    abstract void sound();
}

class Cat extends Animal {
    Cat() {
        System.out.println("Cat Constaructor");
    }

    void sound() {
        System.out.println("Cat Meaws");
    }
}

public class AbstractClassWithConstructor {

}
