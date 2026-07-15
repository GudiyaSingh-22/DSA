package JavaProgram.StringProgram;

public class ProH {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <=2*n; i++) {
            int c = i > n ? 2*n-i: i;
            for (int s = 0; s <n-c; s++) {
            System.out.print(" ");
        }
            for (int j = c; j >=1; j--) {
              System.out.print(j + " ");  
            }
            for (int j = 2; j <=c; j++) {
             System.out.print(j + " ");   
            }
            System.out.println();
        }
    }
}
