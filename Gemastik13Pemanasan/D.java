package Gemastik13Pemanasan;
import java.util.*;
public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = min; i <= max; i++) {
            if (A % i == 0 && B% i != 0 && C % i != 0) {
                count1++;
            }else if(A % i != 0 && B% i == 0 && C % i != 0){
                count2++;
            }else if(A % i != 0 && B% i != 0 && C % i == 0){
                count3++;
            }
        }
        int total = count1+count2+count3;
        System.out.println(total);
    }
}
