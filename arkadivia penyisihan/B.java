import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int time = 0;
        int [] buku = new int[N];
        int [] copy = new int[N-1];
        for (int i = 0; i < buku.length; i++) {
            buku[i] = in.nextInt();
        }
        for (int i = 0; i < M; i++) {
            int search = in.nextInt();
            int indexDitemukan = 0;
            int bukuDitemukan =0;
            
            for (int j = 0; j < buku.length; j++) {
                if (buku[j] == search) {
                    indexDitemukan = j;

                    time += j+j;
                }

            }
            for (int l = 0, k = 0; l < buku.length; l++) {
                if (l != indexDitemukan) {
                    copy[k++] = buku[l];
                }
            }
            for (int j = 1; j < copy.length+1; j++) {
                buku[j] = copy[j-1];
            }
            buku[0] = bukuDitemukan;
        }
        System.out.println(time);
    }
}
