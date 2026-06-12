package JavaProgram.Arrays;

import java.util.Scanner;

public class ColNoFix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
            {1 , 3 , 4, 5},
            {3,6},
            {1,2,34,6}
        };
       for(int row = 0; row < arr.length; row++){
        for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col] + " ");
        }
        System.out.println();
       } 
    }
    
}
