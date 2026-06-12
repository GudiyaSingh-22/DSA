package JavaProgram.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrLi {
    public static void main(String[] args) {
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        //Initialisation
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }


        //Adding elements
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                list.get(i).add(in.nextInt());
                
            }  
        }
        System.out.println(list);
    }
    
}
