class Employee {
     String name;
    double salary;
    Employee(String n, double s) {
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
public class Main {
public static void main(String[] args) {
        Employee e1 = new Employee("Gudiya", 10000);
        Employee e2 = new Employee("Rahul", 15000);
        e1.display();
        e2.display();

        System.out.println("After Increment");
        e1.increaseSalary(10); 
        e2.increaseSalary(20);  
    
} 
} 
