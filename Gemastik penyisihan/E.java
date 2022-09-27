import java.util.*;
public class E {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int [] N = new int[n];
        long A=0;
        long Asementara=1;
        for (int i = 0; i < N.length; i++) {
            N[i]=in.nextInt();
        }
        for (int i = N.length-1; i >= 0; i--) {
            Asementara=(long)Math.pow(N[i],Asementara);

        }
        A=Asementara%100000037;
        System.out.println(A);
    }
}
