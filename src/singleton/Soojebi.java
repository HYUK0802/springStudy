package singleton;

class Parent {
    public Parent() {
        System.out.println("A");
    }
    public void fn() {
        System.out.println("B");
    }
    public void fnA() {
        System.out.println("C");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("D");
    }
    public void fn() {
        System.out.println("E");
    }
    public void fnB() {
        System.out.println("F");
    }
}
public class Soojebi{
    public static void main(String[] args) {
        Child c = new Child();
        c.fn();
        c.fnA();
    }

}

