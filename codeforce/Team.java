import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = n; i > 0; i--) {
            int [] arr = new int[3];
            int itung = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt();
                if(arr[j] == 1){
                    itung++;
                }
            }
            if(itung >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
