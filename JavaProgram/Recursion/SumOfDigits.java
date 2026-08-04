package JavaProgram.Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    System.out.println(sum(a));      
    }
    static int sum(int n){
        if (n==0) {
            return 0 ;
    }
    return n%10 + sum(n/10);
}
}
