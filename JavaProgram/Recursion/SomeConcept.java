package JavaProgram.Recursion;

public class SomeConcept {
    public static void main(String[] args) {
       System.out.println(concept(5)); 
    }
    static int concept(int n){
        if (n==0) {
            return 0;
        }
        System.out.println(n);
        return concept(--n);
    }
    // if instead of --n we use n-- then infinite recursion call will run and only 5 will be printed infinite times.
}
