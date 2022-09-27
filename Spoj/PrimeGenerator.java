
import java.util.*;
public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =in.nextInt();
        for (int i = 0; i < count; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            for (int j = start; j <= end; j++) {
                if (((j % 2 != 0) && (j != 1)) || j ==2  ) {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }
}
