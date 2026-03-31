package polymorphism;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator(); 
        double result = obj.add(42, 72);
        System.out.println(result);
    }
}