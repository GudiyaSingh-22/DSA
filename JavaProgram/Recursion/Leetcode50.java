package JavaProgram.Recursion;

public class Leetcode50 {
    public static void main(String[] args) {
        System.out.println(helper(2, 11));
    }
    public static double helper(double x , int n){
        if (x==0||n==0) {
            return 1;
        }
        if (n<0) {
            return helper(1/x, -n);
        }
        if (n%2==0) {
            return helper(x*x , n/2);
        }
        else{
            return x*helper(x*x, n/2);
        }
    }
}
