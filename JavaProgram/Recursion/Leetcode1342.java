package JavaProgram.Recursion;

public class Leetcode1342 {
    public static void main(String[] args) {
       // int num = 24;
        System.out.println(NoOfstep(24));
    }
    public static int NoOfstep(int num){
        return helper(num,0);
    }
    private static int helper(int num , int steps){
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num/2, steps+1);
        }
        return helper(num-1, steps+1);
    }
}
