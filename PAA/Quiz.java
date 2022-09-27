import java.util.*;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Siswa : ");
        int n = sc.nextInt(); //jumlah siswa
        int [] jenisPermen = new int[n]; //jenis permen
        int [] jumlahPermen = new int[n]; //jumlah permen
        //input jenis permen dan jumlah permen
        int siswaKe = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan jenis permen untuk siswa ke- "+ siswaKe +" : ");
            jenisPermen[i] = sc.nextInt();
            System.out.print("Masukkan jumlah permen untuk siswa ke- "+ siswaKe +" : ");
            jumlahPermen[i] = sc.nextInt();
            siswaKe++;  
        }
        //cari siswa pembawa permen terbanyak
        int max = jumlahPermen[0];
        int index = 0;
        for (int i = 0; i < jumlahPermen.length; i++) {
            if (jumlahPermen[i] > max) {
                max = jumlahPermen[i];
                index = i;
            }
        }
        //hitung total jenis permen
        int [] distinctPermen = Arrays.stream(jenisPermen).distinct().toArray();
        int [] totalJenisPermen = new int[distinctPermen.length];
        // int jenispermen = jenisPermen[0];
        for (int i = 0; i < distinctPermen.length; i++) {
            for (int j = 0; j < jenisPermen.length; j++) {
                if (distinctPermen[i] == jenisPermen[j]) {
                    totalJenisPermen[i] += jumlahPermen[j];
                }
            }
        }
        
        //hasil
        System.out.println("Siswa pembawa permen terbanyak adalah siswa ke-" + (index+1));
        System.out.println("total permen");
        for (int i = 0; i < totalJenisPermen.length; i++) {
            System.out.println(distinctPermen[i] + " : " + totalJenisPermen[i]);
        }
    }
}
