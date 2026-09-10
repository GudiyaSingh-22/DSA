package JavaProgram.Subset;

import java.util.ArrayList;

public class SubseqASCII {
    public static void main(String[] args) {
        //subseqASC("", "abc");
        System.out.println(subseqRetASC("", "abc"));
    }
    static void subseqASC(String p,String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);

        subseqASC(p + ch, up.substring(1));
        subseqASC(p, up.substring(1));
        subseqASC(p + (ch + 0), up.substring(1));
    }


    static ArrayList <String> subseqRetASC(String p,String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subseqRetASC(p + ch, up.substring(1));
        ArrayList<String> second = subseqRetASC(p, up.substring(1));
         ArrayList<String> third = subseqRetASC(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
