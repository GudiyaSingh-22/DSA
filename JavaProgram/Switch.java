package JavaProgram;

import java.util.Scanner;

public class Switch {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int empID = in.nextInt();
    String department = in.next();
    switch (empID) {
        case 1:
            System.out.println("Gudiya Singh");
            switch (department) {
                case "CSE":
                    System.out.println("CSE department");
                    break; 
                    default:
                    System.out.println("Enter valid department");
                    break;
                }
            break;
        case 2:
            System.out.println("Govind Singh");
            switch (department) {
                case "CSE":
                    System.out.println("CSE department");
                    break;
                    default:
                    System.out.println("Enter valid department");
                    break; 
                }
            break;
        case 3:
            System.out.println("Anurag Singh");
            switch (department) {
                case "management":
                    System.out.println("Management department");
                    break;
                default:
                    System.out.println("Enter valid department");
                    break;
            }
        break;
        default:
            System.out.println("Enter valid empID");
            break;
    }
 }   
}
