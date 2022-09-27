import java.util.*;
public class Nextround {
    public static int nextround(int []arr, int k) {
        int pesertalolos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0 && arr[i]>=arr[k]){
                pesertalolos++;
            }
        }

        return pesertalolos;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(nextround(arr, k));
    }

    
}
