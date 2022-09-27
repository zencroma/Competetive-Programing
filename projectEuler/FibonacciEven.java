/**
 * FibonacciEven
 */
public class FibonacciEven {

    public static void main(String[] args) {
        long n1= 0;
        long n2=1;
        long n3 =0;
        long banyakGenap=0;
        long total=0;

        while (n3<=4000000) {
            //karena nilai fibonacci adalah bilangan dari pertambahan bilangan selanjutnya
            n3=n1+n2;
            //n1 menjadi bilangan selanjutnya begitu pun dengan n2
            n1=n2;
            n2=n3;
            //mengecek apakah niali fibonacci genap
            //jika iya maka kita tambahkan semua bilangan genap yang bisa ditemukan
            if (n3%2==0) {
                banyakGenap++;
                total+=n3;
            }
            System.out.print(n3+" ");
            
        }
        
        System.out.println("banyaknya angka genap: "+banyakGenap);
        System.out.println(total);
    }
}