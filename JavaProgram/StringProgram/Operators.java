package JavaProgram.StringProgram;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//adding the ascii values of the string
        System.out.println("a"+"b");//concatinating the string
        System.out.println('a'+3);//adding ascii and integer
        System.out.println((char)('a'+3));//print the ascii character at that value

        System.out.println("a"+1);//when an integer is added with a string it is converted to its wrapper class integer
        //integer will be converted to Integer that will call toString

        System.out.println("Gudiya"+ new ArrayList<>());//as array is empty it will add only []
        System.out.println("Gudiya"+new Integer(56));//56 will be added to string
        
        
       // System.out.println(new Integer(56)+new ArrayList<>()); //shows error as operator + can be applied to primitives and string
        System.out.println(new Integer(56)+ ""+new ArrayList<>());//atleast one string should be there

       //operator minus can not be applied to string
       //operator plus in java is defined for only primitives and string 



    }
}
