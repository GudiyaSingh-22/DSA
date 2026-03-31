final class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Test {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.sound();   // calling method
    }
}
