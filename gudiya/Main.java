import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans;

        if (x < y) {
            ans = y - x;
        } else {
            int diff = x - y;

            if (diff % 2 == 0) {
                ans = diff / 2;
            } else {
                ans = 1 + (diff + 1) / 2;
            }
        }

        System.out.println(ans);
    }
}