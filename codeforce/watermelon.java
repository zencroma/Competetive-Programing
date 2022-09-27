/**
 * watermelon
 */
import java.util.*;
public class watermelon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 ==0 && num > 2) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}