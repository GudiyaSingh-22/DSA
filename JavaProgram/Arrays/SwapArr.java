package JavaProgram.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArr {
    public static void main(String[] args) {
       // int[] arr = {20,45,63,78,90,65};
       Scanner in = new Scanner(System.in);
       int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       
        swap(arr, 1 , 5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr, int index1 , int index5){
     int temp = arr[index1];
     arr[index1] = arr[index5];
     arr[index5] = temp;
        }
    
}
