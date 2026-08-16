package Interface;

interface A {
    public void displayA();
}

interface B {
    public void displayB();
}

class C implements A, B {
    public void displayB() {
        System.out.println("Hello from B");
    }

    public void displayA() {
        System.out.println("Hello from A");
    }
}

public class Interface {

}
