package JavaProgram.StringProgram;

public class ProG {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 0; i <=5; i++) {
            for (int s = 0; s <n-i; s++) {
            System.out.print(" ");
        }
            for (int j = i; j >=1; j--) {
              System.out.print(j);  
            }
            for (int j = 2; j <=i; j++) {
             System.out.print(j);   
            }
            System.out.println();
        }
    }
}
