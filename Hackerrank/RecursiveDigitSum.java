import java.util.Scanner;
public class RecursiveDigitSum {
    static int  count =0;
    public static String Super_Digit(String s , int k){
        String Sd = "";
        for (int i = 0; i <= k; i++) {
            Sd += s;
        }
        
        return Sd;
        
    }
    public static String  SuperDigit(String x){
        char []digit = x.toCharArray();
        if(digit.length == 1){
            return Character.toString(digit[0]);
        }else{
            int sum=0;
            for (int i = 0; i < digit.length; i++) {
                sum+= Character.getNumericValue(digit[i]);
            }a
            return SuperDigit(Integer.toString(sum));
        }   

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N =in.next();
        int k = in.nextInt();

        System.out.println(SuperDigit(Super_Digit(N, k)));
        

        
    }
}
