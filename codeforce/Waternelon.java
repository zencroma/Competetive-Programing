import java.util.*;
public class Waternelon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        //check if watermelon can be divide into even part not necessarily equal
        if (w%2==0&& w > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
