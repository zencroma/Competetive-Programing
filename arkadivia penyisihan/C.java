import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] A = new int[N];
        int [] B = new int[N];
        int [] total = new int[N];
        int totalTerbesar = 0;
        int min = 0;
        for (int i = 0; i < N; i++) {
            total[i] = A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            total[i] += B[i] = in.nextInt();
        }
        totalTerbesar = total[0];
        for (int i = 0; i < total.length; i++) {
            if (total[i] > totalTerbesar) {
                totalTerbesar = total[i];
            }

            if (total[i] < totalTerbesar) {
                min += (totalTerbesar-total[i]);
            }
        }
        System.out.println(min);

    }
}
