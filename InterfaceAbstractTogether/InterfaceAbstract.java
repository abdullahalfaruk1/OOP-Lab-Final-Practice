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

    void display() {
        System.out.println("Pappy Display");
    }
}

public class InterfaceAbstract {
    public static void main(String[] args) {
        Pappy p = new Pappy();
        p.show();
        p.display();

    }
}
