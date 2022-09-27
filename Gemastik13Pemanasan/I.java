package Gemastik13Pemanasan;
import java.util.*;
public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();//jumlah operasi 
        int [] jumlah = new int[N];
        int i = 0;
        for (int j = 0; j <= N; j++) {
            int A = in.nextInt();
            int B =  in.nextInt();
            int count = 0;
            for (int l= A;l<= B;l++) {
                if (A %l ==0)
                {
                    System.out.print(l);
                    count++;
                }
            }
            jumlah[j] = count;
        
        }
            
        
        //print hasil
        for (int j = 0; j < jumlah.length; j++) {
            System.out.println(jumlah[j]);
        }
    }
}
