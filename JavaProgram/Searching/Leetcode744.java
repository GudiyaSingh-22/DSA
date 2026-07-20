package JavaProgram.Searching;

public class Leetcode744 {
 public static void main(String[] args) {
    char [] letters = {'c','f','j'};
    char target = 'c';
    char ans = nextGreatestNo(letters, target);
    System.out.println(ans);
 }
 static char nextGreatestNo(char [] letters , char target){
   int start = 0;
   int end = letters.length-1;
   while (start>=end) {
    int mid = start + (end-start)/2;
    if (target<mid) {
        end = mid-1;
    } else{
        start = mid +1;
    }
   }
   return letters[start % letters.length];
 } 
}
