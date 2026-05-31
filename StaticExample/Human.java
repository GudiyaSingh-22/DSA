package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; 

    Human(int age,String name,int salary,boolean married){
         this.age=age;
    this.name=name;
    this.salary=salary;
    this.married=married;
    Human.population += 1;
    }
//     public static void main(String[] args) {
//     Human Gudiya = new Human(20, "Gudiyaa", 3000000, false);
//     System.out.println(Gudiya.salary);
// }       
}
