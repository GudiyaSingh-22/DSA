package JavaProgram.Arrays;
import java.util.*;
import java.util.ArrayList;

public class ArrListEx {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        // list.add(7);
        // list.add(43);
        // list.add(67);
        // list.add(32);
        // list.add(90);
        // list.add(46);
        // list.add(54);
        // System.out.println(list);
        // list.size();
        // System.out.println(list.size());
        // list.getClass();
        // System.out.println(list.getClass());
        Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
        System.out.println(list);
    }  
}
