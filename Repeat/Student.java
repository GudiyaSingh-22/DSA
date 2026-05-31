package Repeat;

public class Student{
    int marks;
    String name;
Student(int m , String p){
    this.marks = m;
    name = p;
}
void result(){
    System.out.println("Name:"+ name);
}
void display(){
    System.out.println("Marks:"+ marks);
}

public static void main(String[] args) {
      Student s1 = new Student(56, "uyg");
     Student s2 = new Student(59, "yjg");
     s1.result();
     s2.display();
} 
}