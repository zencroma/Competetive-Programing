import java.util.*;

public class Cypher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] result = new int[t][];
        int i = 0;
        while (i < t) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] hasil = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt();
            }
            for (int j2 = 0; j2 < n; j2++) {
                // System.out.println(arr[j2]);
                int b = in.nextInt();
                String c = in.next();
                for (int k = 0; k < c.length(); k++) {
                    if (c.charAt(k) == 'D') {
                        arr[j2]++;
                        if (arr[j2] >= 10) {
                            arr[j2] = 0;
                            // } else {
                            // arr[j2]++;
                            //
                        }
                    } else if (c.charAt(k) == 'U') {
                        arr[j2]--;
                        if (arr[j2] < 0) {
                            arr[j2] = 9;
                            // } else {
                            // arr[j2]--;
                            //
                        }
                    }
                    hasil[j2] = arr[j2];
                }
                // System.out.println(arr[j2]);

            }
            result[i] = hasil;
            i++;
        }
        System.out.println();
        for (int j = 0; j < result.length; j++) {
            for (int k = 0; k < result[j].length; k++) {
                System.out.print(result[j][k] + " ");
            }
            System.out.println();
        }
    }
}
