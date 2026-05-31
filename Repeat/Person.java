package Repeat;

public class Person {
    int height;
    String name;
    int age;

//Person Gudiya;
Person(int h, String n, int a){
    height=h;
    name=n;
    age=a;
}
void display(){
    System.out.println("name:" + name );
}
public static void main(String[] args) {
    Person p1 = new Person(5,"Gudiya",20);
    //System.out.println(p1.name);
p1.display();
} 
}

