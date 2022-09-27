/**
 * IntRegex
 */
import java.util.*;
public class IntRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan string yang berisi digit: ");
        String s = sc.next();
        String angka = s.replaceAll("[^0-9]", "");
        System.out.println("maka ekstraksi angka menghasilkan: "+angka);
    }
    
}