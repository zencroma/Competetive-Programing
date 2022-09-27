/**
 * NaiveStringMatcher
 */
import java.util.Scanner;
public class NaiveStringMatcher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pattern = sc.next();
        int i = 0;
        int j = pattern.length() - 1;
        for (int s = 0;s<str.length()-pattern.length();s++) {
            if (pattern.equals(str.substring(s,j+1))) {
                System.out.println("Pattern ditemukan di index: "+(i));
            }
            j++;
        }



    }
}