package JavaProgram.Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[]arr = {1,2,2,4};
        int[] ans = setMis(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] setMis(int[]arr){
        int i=0;
        int correct=arr[i]-1;
        while (i<arr.length) {
            if (arr[i]!=arr[correct]) {
                swap(arr,i,correct);
        }else{
            i++;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1) {
                return new int[]{arr[index],index+1};
            }
        }
    }
    return new int[]{-1,-1};
}
static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}