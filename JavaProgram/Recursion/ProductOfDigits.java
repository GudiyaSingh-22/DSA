package JavaProgram.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
      System.out.println(helper(21042,1));  
    }
    static int helper(int n,int product){
        if(n == 0){
            return product ;
        }
       int digit = n%10;    
        if (digit != 0) {
            product = product * digit;
            return helper(n/10, product);
        }
        return helper(n/10, product);
    }
}
