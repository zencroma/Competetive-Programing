/**
 * M
 */
import java.util.*;
import java.math.*;
public class M {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        BigInteger hasil,nilaiMod,nilai,exponentA,exponentB;
        exponentA = BigInteger.valueOf(A);
        exponentB = BigInteger.valueOf(B);
        nilaiMod =BigInteger.valueOf((long) Math.pow(25,(double)A));
        nilai = nilaiMod =BigInteger.valueOf((long) Math.pow(17081945,(double)A));

        hasil = nilai.mod(nilaiMod);
        if (hasil.equals("0")){
            System.out.println("Tidak");
        }else{
            System.out.println("Ya");
        }


        

    }
    
}