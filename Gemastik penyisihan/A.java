import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            int l = in.nextInt();
            int lipat = in.nextInt();

            for (int j = 0; j < lipat; j++) {
                if(p>l){
                    p=p/2;
                } else {
                    l=l/2;
                }
            }
            if (p>l){
                System.out.println(p +" " +l);
            }else{
                System.out.println(l +" " +p);
            }
        }
    }
}
