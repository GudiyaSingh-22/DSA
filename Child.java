class Parent {
    void show() {
        System.out.println("Parent");
    }
}

public class Child extends Parent {
    void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); 
    }
}

