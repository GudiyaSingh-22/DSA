package JavaProgram;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        System.out.println("Enter the temp in celsius:");
      try (Scanner input = new Scanner(System.in)) {
        float tempC = input.nextFloat();
          float tempF = (tempC * 9/5) + 32 ;
          System.out.println("Temp in fahrenhiet is = " + tempF);
    }

    }
}
