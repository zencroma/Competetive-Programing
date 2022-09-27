/**
 * Bit++
 */
import java.util.*;
public class Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x =0;
        int i = 0;
        
        while (i<=n) {
            String input = in.nextLine();
            if (input.contains("++")) {
                x++;
            }
            if (input.contains("--")) {
                x--;
            }
            i++;
        }
        System.out.println(x);
    }
    
}