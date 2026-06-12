package JavaProgram;
import java.util.Scanner;
public class LargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

    //     int max = a;
    //     if (b>max) {
    //         max=b;           
    //     }
    //     if (c>max) {
    //         max=c;
    //     System.out.println("largest no is = " + max);
    // }
    int max = Math.max(c,Math.max(a, b));
    System.out.println(max);
}
}
