package JavaProgram;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
       String personalized = myGreet(name);
        System.out.println(name);
        System.out.println(greet());
    }
        static String myGreet(String name ){
            String message = "Hello "  + name;
            return message;
        }
        static String greet(){
            String greeting = "How are you ??";
            return greeting;
        }
    }