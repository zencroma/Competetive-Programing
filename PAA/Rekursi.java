/**
 * Rekursi
 */
public class Rekursi {
    public static void main(String[] args) {
        System.out.println(cek(2,1));
    }
    public static int cek(int m, int n){
        if(m == 0){
            return n+1;
        } else if(m > 0 && n == 0){
            return cek(m-1, 1);
        } else if(m>0 && n > 0){
            return cek(m-1,cek(m, n-1));
        } else {
            return 0;
        }
    }
}