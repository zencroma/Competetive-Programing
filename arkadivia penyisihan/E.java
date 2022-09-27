import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class E {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S=in.nextLine();
        Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(S);
        boolean check = match.find();
        if (check){
            System.out.println("Emor tidak beruntung :(");
        }
        else{
            char [] c = S.toCharArray();
            
            for (int i = 0; i < c.length; i++) {
                if (Character.isUpperCase(c[i])) {
                    c[i] = Character.toLowerCase(c[i]);
                }
            }
            for (int i = c.length-1; i >= 0; i--) {
                System.out.print(c[i]);
            }
        }    
    }
    
}
