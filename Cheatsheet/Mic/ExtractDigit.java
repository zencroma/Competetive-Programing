// ekstraksi digit 
package Mic;

import java.util.*;
public class ExtractDigit {
    public static void main(String[] args) {
        int n,m,a,i = 1,counter =0;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = n;
        while (n>0) {
            n /= 10;
            counter++;
        }
        while (m>0) {
            a = m%10;
            System.out.println("Digit position" + counter+":"+a);
            m /=10;
            counter++;
        }
    }
}
