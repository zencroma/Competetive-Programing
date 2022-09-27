import java.util.*;
public class YesOrYes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i = 0;
        String [] result = new String[t];
        while (i<t) {
            String input = in.next();
            //cek if equal to yes
            if (input.equalsIgnoreCase("yes")) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
            i++;
        }
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }
}
