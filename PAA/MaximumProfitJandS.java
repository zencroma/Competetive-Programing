import java.util.*;
public class MaximumProfitJandS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahBarang = in.nextInt();
        int [] W = new int[jumlahBarang];
        int [] X = new int[jumlahBarang];
        int T = in.nextInt();
        
        for (int i = 0; i < jumlahBarang; i++) {
            W[i] = in.nextInt();
            X[i] = in.nextInt();
        }


    }
    public static int [] swap(int a,int b,int[]arr) {
        int temp = arr[a];
        arr[a] = b;
    }
}
