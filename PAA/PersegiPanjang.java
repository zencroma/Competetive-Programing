import java.text.DecimalFormat;
import java.util.*;
public class PersegiPanjang {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah operasi: ");
        int n = in.nextInt();
        int i = 0;
        int jml = i+1;
        float rata_rata = 0;
        while (i<n) {
            System.out.print("Masukkan Panjang: ");
            int panjang = in.nextInt();
            System.out.print("Masukkan Lebar: ");
            int lebar = in.nextInt();
            int luas = panjang * lebar;
            rata_rata += luas;
            rata_rata /= jml;
            System.out.printf("Rata-rata luas persegi panjang adalah: " + df.format(rata_rata));
            System.out.println();
            jml++;
            i++;
        }
            
    }
}
