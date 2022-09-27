import java.math.*
;public class FactorialDigitSum {
    public static void main(String[] args) {
        BigInteger zero =new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger j= zero;
        BigInteger factorial = zero;
        for (int i =100; i >= 0; i--) {
            factorial=factorial.multiply.(j.valueOf((long)i));
        }
        System.out.println(factorial);
    }
}
