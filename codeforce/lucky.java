import java.util.*;

/**
 * lucky
 */
public class lucky {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String [] num = new String[t];
        String [] isLucky = new String[t];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.next();
        }
        
        int [] first_total =new  int[t]; 
        int [] last_total = new int[t]; 
        //string to int 
        for (int i = 0; i < num.length; i++) {
            int j = 0; 
            char [] c = num[i].toCharArray();
            int sumFirst = 0;
            int sumLast = 0;
            for (int k = 0; k < c.length/2; k++) {
                j = k+3;
                if (Character.isDigit(c[k])) {
                    int a = Integer.parseInt(String.valueOf(c[k]));
                    int b = Integer.parseInt(String.valueOf(c[j]));
                    sumFirst+= a;
                    sumLast+=b;

                }
            }
            first_total[i] = sumFirst;
            last_total[i] = sumLast;
        }

        for (int i = 0; i < last_total.length; i++) {
            if (first_total[i] == last_total[i]) {
                isLucky[i] = "Yes";
            }else{
                isLucky[i] = "No";
            }
        }
        for (int i = 0; i < isLucky.length; i++) {
            System.out.println(isLucky[i]);
        }

    }
}