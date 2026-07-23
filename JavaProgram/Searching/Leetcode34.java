package JavaProgram.Searching;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
        int[]nums={5,7,7,8,8,10};
        int target = 8;
        Leetcode34 obj = new Leetcode34();
        int[] ans = obj.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    int search(int[]nums,int target,boolean findStartIndex){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target<nums[mid]) {
                end=mid-1;
            }
            else if (target==nums[mid]) {
                ans= mid;
                if(findStartIndex){
                  end = mid -1;  
                }
                else{
                start=mid+1;
            }
            }
            else{
                start=mid+1;
            }
        }
    return ans;
    }
    }
