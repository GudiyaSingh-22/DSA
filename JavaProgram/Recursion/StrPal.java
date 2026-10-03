package JavaProgram.Recursion;

public class StrPal {
    public static void main (String[]args){
        String str = "abcab";
        int mid;
        if (str.length() % 2 != 0) {
            mid = str.length() / 2 + 1;
        } else {
            mid = str.length() / 2;
        }

        System.out.println( pal(str, 0, mid));
    }

    static boolean pal(String str, int i, int j) {
        if (j == str.length())
            return true;
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        return pal(str, i + 1, j + 1);
    }
}
