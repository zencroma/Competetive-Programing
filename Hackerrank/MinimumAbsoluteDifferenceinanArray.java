import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceinanArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] data =  new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }
        Arrays.sort(data);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length-1; i++) {
            if(min > data[i+1] - data[i]){
                min = data[i+1] - data[i];
            }
        }
        System.out.println(min);
    }
}