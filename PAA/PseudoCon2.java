/**
 * PseudoCon
 */
import java.util.*;
public class PseudoCon2 {

    public static void main(String[] args) {
        //genap
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}