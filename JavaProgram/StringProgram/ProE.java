package JavaProgram.StringProgram;

public class ProE {
public static void main(String[] args) {
  pattern(6);  
}  
static void pattern(int n){
    for(int row=1; row<=2*n; row++){
        int totalColsInRow = row >n?2*n -row: row;
        for(int col=1; col< totalColsInRow; col++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
