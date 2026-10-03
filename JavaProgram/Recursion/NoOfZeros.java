package JavaProgram.Recursion;

public class NoOfZeros {
    public static void main(String[] args) {
        System.out.println(helper(3020, 0));
    }
    private static int helper(int n,int c){
        if (n == 0) {
            return c;
        }
        int digit = n%10;
        int count = 0 ; 
        if (digit == 0) {
            count = helper(n/10, c+1);
        }else {
            count = helper(n/10, c);
        }

        return count ; 
       
    }
}
