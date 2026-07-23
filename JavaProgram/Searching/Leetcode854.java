package JavaProgram.Searching;

public class Leetcode854 {
    public static void main(String[] args) {
        int[]arr={2,4,6,8,10,9,6,3,1};
       Leetcode854 obj = new Leetcode854();
       int ans = obj.peakIndexInMountainArray(arr);
       System.out.println(ans); 
    }
    public int peakIndexInMountainArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int mid = start + (end - start)/2;
            if (arr[mid]>arr[mid+1]) {
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
    
}
