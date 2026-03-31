class Employe {
     String name;
    double salary;
    Employe(String n, double s) {
        name = n;
        salary = s;
    }
    void increaseSalary(double percentage) {
        double increment = salary * percentage / 100;
        salary = salary + increment;

        System.out.println("Updated Salary of " + name + " is: " + salary);
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class Employee {
public static void main(String[] args) {
        Employe e1 = new Employe("Gudiya", 10000);
        Employe e2 = new Employe("Rahul", 15000);
        e1.display();
        e2.display();

        System.out.println("After Increment");
        e1.increaseSalary(10); 
        e2.increaseSalary(20);  
    
} 
} 
    
