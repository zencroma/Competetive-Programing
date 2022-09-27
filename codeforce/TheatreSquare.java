import java.util.*;
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n   = in.nextInt();
        int m   = in.nextInt();
        int a   = in.nextInt();
        //untuk memenuhi persegi panjang secara optimal
        //maka cukup mengisi persegi sesuai dengan panjang sisi-sisi persegi panjang
        //maka cukup dibagi panjang dan lebar dengan sisi persegi 
        //maka dengan cara membagi nilai n dengan a dan membagi nilai m dengan a
        int count = (int)(Math.ceil(n/(double)a)*(Math.ceil(m/(double)a)));

        System.out.println(count);
    }
}
