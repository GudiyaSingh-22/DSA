package JavaProgram.Sorting;

import java.util.Arrays;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,3,2,1};
         allDup(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void allDup(int[]nums){
        int i =0;
        while (i<nums.length) {
            int correct = nums[i]-1;
            if (nums[i]<nums.length && nums[i]!=nums[correct]) {
                swap(nums, i, correct);
            }else{
                i++;
            }
            for (int index = 0; index < nums.length; index++) {
                if (nums[index]!= index+1) {
                    System.out.print(index);
                }
            }
        }
    } 

    static void swap(int[]nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
