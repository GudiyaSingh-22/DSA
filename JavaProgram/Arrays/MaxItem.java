package JavaProgram.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        // int[] arr = {12, 45, 67, 89, 32, 20};
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int maxVal= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxVal) {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    
}
