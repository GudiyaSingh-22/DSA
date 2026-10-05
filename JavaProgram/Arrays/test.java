package JavaProgram.Arrays;

public class test {
    public static void main(String[] args) {
     System.out.println(sum(10, 20));        
    }
    public static String sum(int a , int b){
        int prod = product(a, b);
        //System.out.println(product(a,b));
        int s = a+ b ; 
        return prod + " " + s ; 
        
        
    }
    public static int product(int a , int b){
        return a*b;
    }
}
