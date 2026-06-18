package JavaProgram.StringProgram;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));

        System.out.println("a"+1);//when an integer is added with a string it is converted to its wrapper class integer
        //integer will be converted to Integer that will call toString

        System.out.println("Gudiya"+ new ArrayList<>());//as array is empty it will add only []
        


    }
}
