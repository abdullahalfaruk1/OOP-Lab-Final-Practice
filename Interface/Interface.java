package Interface;

interface A {
    public void displayA();
}

interface B {
    public void displayB();
}

class C implements A, B {
    public void displayA() {
        System.out.println("Hello from A");
    }

    public void displayB() {
        System.out.println("Hello from B");
    }

}

public class Interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
    }
}
