import java.util.*;
public class EqCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int [] ate = new int[t];
        int i = 0;
        while (i<t) {
            int n = in.nextInt();
            int [] box = new int[n];
            int min = 0;
            int eaten = 0;
            for (int j = 0; j < box.length; j++) {
                box[j] = in.nextInt();
            }
            min = box[0];
            for (int j = 0; j < box.length; j++) {
                if (box[j] < min) {
                    min = box[j];
                }
            }
            for (int j = 0; j < box.length; j++) {
                if (min != box[j]) {
                    eaten += Math.abs(min - box[j]);
                }
            }
            ate [i] = eaten;
            i++;
        }
        for (int j = 0; j < ate.length; j++) {
            System.out.println(ate[j]);
        }
    }
}
