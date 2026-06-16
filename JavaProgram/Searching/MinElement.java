package JavaProgram.Searching;

import java.util.Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {23,-2,56,89,0,54,65,12,43,21};
        System.out.println((MinValue(arr)));
    }
    static int MinValue(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans) {
                 ans = arr[i];
            }
        }
        return ans;
    }
    
}
