/**
 * PowerDigitSum
 */
import java.math.*;
public class PowerDigitSum {

    public static void main(String[] args) {
        //menggunakan big integer karena nilainya sangat besar 
        //Big integer tidak seperti tipe data primitive maka menggunakan String yang mempunyai Value
        BigInteger zero=new BigInteger("0");
        BigInteger ten = new BigInteger("10");
        BigInteger Jumlah = zero;
        BigInteger power = new BigInteger("2").pow(1000);
        while (power.compareTo(zero)>0) {
            //diambil digitnya jadi satuan terus ditambah 
            Jumlah=Jumlah.add(power.mod(ten));
            //dihilangkan nilai satuan tadi 
            power= power.divide(ten);

        }
        System.out.println(Jumlah);
    }
}