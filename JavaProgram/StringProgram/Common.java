package JavaProgram.StringProgram;

import java.util.Arrays;

public class Common {
    public static void main(String[] args) {
        String a = "Gudiya";//object at string pool
        String b = "Gudiya";//indicates the same object of string pool
        System.out.println(a==b);//comparison

        String name1 = new String("Govind");//creates object outside string pool
        String name2 = new String("Govind");//creates diff obj outside string pool
        System.out.println(name1==name2);

        System.out.println(name1.equals(name2));//compares value not object
        System.out.println(a.charAt(3));//to find the character of string at that particular index

        System.out.println();
        System.out.println();
         
        System.out.println(56);
        Integer num = new Integer(56);//wrapper class
        System.out.println(num.toString(56));//if put in wrapper class so many functions can be used

        System.out.println();
        System.out.println();



        System.out.println("Gudiya");
        System.out.println(new int[]{1,2,3,4,5});//return toString value of built-in function 
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));//forcefull implementation of users toString
        




    }
}
