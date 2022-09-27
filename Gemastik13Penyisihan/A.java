import java.util.Arrays;
import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String X = in.next();
        String[] data = new String[N];
        int min=Integer.MAX_VALUE;
        int x = Integer.parseInt(X);
        for (int i = 0; i < N; i++) {
            data[i] = in.next();
        }
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            int a = Integer.parseInt(data[i]);
            
            if(Math.abs(a-x) < min){
                min = Math.abs(a-x);
            }
        }
        for (int i = 0; i < N; i++) {
            if(Math.abs(Integer.parseInt(data[i])-x )== min){
                System.out.println(data[i]);
            }
        }
    }
}
