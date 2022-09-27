import java.util.*;
public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long Number = in.nextLong();
        //Cari apakah nilai Number adalah genap atau ganjil.
        //karena kita mencari faktor maka kita cari nilai terkecil jika genap
        while (Number%2==0) {
            Number/=2;
        }
        //karena kita hanya mencari faktor bilangan prima nilai terkecil bil prima adalah 3
        //maka kita asumsi semua adalah ganjil
        //karena nilai increment yang kita gunakan hanya ganjil maka i ditambah 2
        for (long i = 3; i < Number; i+=2) {
            //Jika Number bisa dibagi faktor maka kita bagi higga Number tidak bisa dibagi
            //maka dari itu nilai Number adalah bilangan prima
            while (Number%i==0&& i<Number ) {
                Number/=i;
            }
        }
        System.out.println(Number);   
    }
}
