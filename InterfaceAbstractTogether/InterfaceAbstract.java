package InterfaceAbstractTogether;

interface Animal {
    void show();
}

abstract class Cat {
    abstract void display();

    Cat() {
        System.out.println("Cat constructor");
    }
}

class Pappy extends Cat implements Animal {
    public void show() {
        System.out.println("Pappy Show");
    }

    public void display() {
        System.out.println("Pappy Display");
    }
}

public class InterfaceAbstract {

}
