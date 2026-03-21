public class Student {
    int rollno;
    String branch ;
    String name;
    Student(int r, String b, String n){
        rollno = r;
        branch = b;
        name = n;
    }
    Student(){
        System.out.println("hello i am constrcter"); 
    }
    String getName(){
        return name ;
    }
    void setName(String s){
        name = s ;

    }

    public static void main(String[] args) {
        Student s1 = new Student(); 
        String name = s1.name; 
        System.out.println(name); 
        Student s2 = new Student(101,"cse", "govind") ;
        Student s3= new Student(101,"cse", "gudiya") ; 
        System.out.println(s2.getName()) ;
        s3.setName("Gudiya Singh");
        System.out.println(s3.getName()); 
        System.out.println(s1.name);
       }
}
 
