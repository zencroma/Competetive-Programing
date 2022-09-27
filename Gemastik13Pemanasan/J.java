package Gemastik13Pemanasan;
import java.util.*;
public class J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] arr = new int[N];
        int [] dupp = new int[N];
        int [] reversedupp = new int[N];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        dupp = Arrays.sort(arr.clone());
        int i, temp; 
        for (i = 0; i < reversedupp.length / 2; i++) { 
            temp = reversedupp[i]; 
            reversedupp[i] = reversedupp[size - i - 1]; 
            reversedupp[reversedupp.length - i - 1] = temp; 
        }
        
        

    }
}
