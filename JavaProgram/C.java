package JavaProgram;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the valid input:");
        // int Age = input.nextInt();
        // if (Age>=18) {
        //     System.out.println("valid for voter id");
        // }
        // else{
        //     System.out.println("Not validfor voter id");
        // }
        int Salary = input.nextInt();
        if (Salary>=10000) {
            System.out.println(Salary+2000);
        }
        else
        {
            System.out.println(Salary+5000);
        }
    }
    
}
