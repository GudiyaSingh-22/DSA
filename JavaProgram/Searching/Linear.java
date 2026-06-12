package JavaProgram.Searching;

public class Linear {
 public static void main(String[] args) {
    int[] nums = {12, 54, 67, 43, 90,34,76,28,92};
    int target = 90;
    int ans = LinearSearch(nums, target);
    System.out.println(ans);
 }  
 static int LinearSearch(int[] arr , int target){
    if (arr.length == 0) {
        return -1;
    }
  for (int i = 0; i < arr.length; i++) {
    int element = arr[i];
    if (element == target) {
     return i;   
    }
  }
  return -1;
 } 
}
