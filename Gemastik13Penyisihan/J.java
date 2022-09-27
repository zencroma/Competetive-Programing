import java.util.*;

public class J {
    public static int maximumsumarray(int []arr, int M) {
        int hasil = 0;
        int sliding =0;
        int slidingsum =0;
        
        for (int i = 0;  i < arr.length;  i++) {
            slidingsum+=arr[i];
            if(i>=M){
                hasil = Math.max(hasil,slidingsum);
                slidingsum -=arr[sliding];
                sliding++;
            }
        }

        return hasil;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int hasil =0;
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }   
        System.out.println(maximumsumarray(arr,M));
        
    }
}
