package JavaProgram.Rough;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[]nums = {5,4,3,2,1};
        Selection(nums);
        System.out.println(Arrays.toString(nums));
    }
     static void Selection(int[]nums){
        for (int i = 0; i < nums.length; i++) {
            int lastIndex = nums.length-i-1;
             int maxIndex = getMaxIndex(nums,0,lastIndex);
            swap(nums, maxIndex, lastIndex);
        }
     }
     static void swap(int[]arr,int first,int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
     }
     static int getMaxIndex(int[]nums,int start,int end){
        int max = start;
        for (int i = start; i <=end; i++) {
        if (nums[max]<nums[i]) {
            max=i;
        }
     }
    return max;
     }
}