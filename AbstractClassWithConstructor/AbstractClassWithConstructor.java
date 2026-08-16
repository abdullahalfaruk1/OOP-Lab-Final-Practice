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

class Dog extends Animal {
    Dog() {
        System.out.println("Dog Constructor");
    }

    void sound() {
        System.out.println("Dog Barks");
    }
}

public class AbstractClassWithConstructor {

}
