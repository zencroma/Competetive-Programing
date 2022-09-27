import java.util.*;
public class CariFib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n1 = 0,n2 = 0,n3 = 0,total = 0;
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                n3 = n1+n2;
                total += n3;
                n1 = n2;
                n2 = n3;
            }
            System.out.println(total);
        }
    }



       
}
