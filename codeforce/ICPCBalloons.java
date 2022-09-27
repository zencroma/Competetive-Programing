import java.util.*;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // make array A to Z
        char[] alphabet = new char[26];
        // for (int i = 0; i < 26; i++) {
        //     alphabet[i] = (char) ('A' + i);
        // }
        // make array of tagged first solve
        

        int[] result = new int[t];
        int i = 0;
        while (i < t) {
            int[] firstSolve = new int[26];
            int jumlahBalon = 0;
            int n = in.nextInt();
            String s = in.next();
            // every chara in s is converted to its index in alphabet
            char[] sArray = s.toCharArray();
            for (int k = 0; k < sArray.length; k++) {
                int index = sArray[k] - 'A';
                if (firstSolve[index] == 0) {
                    firstSolve[index] = 1;
                    jumlahBalon = jumlahBalon + 2;
                } else {
                    jumlahBalon = jumlahBalon + 1;
                }

                result[i] = jumlahBalon;
            }
            i++;
        }
        for (int k = 0; k < t; k++) {
            System.out.println(result[k]);
        }
    }
}
