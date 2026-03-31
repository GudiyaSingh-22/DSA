package polymorphism;

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
     void shows() {
        System.out.println("Parent");
    }

}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
} 
