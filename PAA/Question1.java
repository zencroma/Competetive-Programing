import java.util.*;	// Import the Scanner class	
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; //jumlah kambing
        int [] W = new int[n]; //berat kambing
        //input berat kambing

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan berat kambing ke-" + (i+1) + " : ");
            W[i] = sc.nextInt();
        }

        //cari kambing paling menguntungkan 
        int max = W[0];
        int index = 0;
        for (int i = 0; i < W.length; i++) {
            if (W[i] > max) {
                max = W[i];
                index = i;
            }
        }
        //harga
        double h = (W[index] * 0.3) * 100000;
        index++;
        //hasil
        System.out.println("Kambing paling menguntungkan adalah kambing K"+index);
    }
}
