import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = in.nextInt();
        int max = in.nextInt();

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int hasil = 0;
        for (int i = min; i < max+1; i++) {
            if ((i%A == 0 && i%B !=0 && i%C != 0) ||
                (i%A != 0 && i%B ==0 && i%C != 0) ||
                (i%A != 0 && i%B !=0 && i%C == 0)){
                    hasil++;
            }
        }
        System.out.println(hasil);
    }
}