package JavaProgram.StringProgram;

public class ProI {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n ){
        n=2*n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int atEveryIndex =Math.min(Math.min(i, j),Math.min(n-i,n-j)); 
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}
