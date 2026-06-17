package JavaProgram.Sorting;

import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {0,4,2,1};
        int ans = missingNo(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
   public static int missingNo(int[]arr){
        int i=0;
        while (i<arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr,i,arr[i]);
            }else{
                i++;
            }
        }
       // case 1: if 0,1,2,4 situaton then 3 is missing so index 3 is printed
       for (int index = 0; index < arr.length; index++) {
        if (arr[index] != index){
           return index;
        }
       } 
       //case 2 : if 0,1,2,3 situation and n=4 then array length is return
       return arr.length;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
