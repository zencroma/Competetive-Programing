
public class SmallestMultiple {
    public static void main(String[] args) {
        int smallest =0;
        boolean cek = true;
        int n = 20;
        while (smallest==0) {
            cek = true ;
            for (int i = 2; i <= 20; i++) {
                if (n%i!=0) {
                    cek=false;
                    break;
                    
                }
            }
            if (cek) {
                smallest=n;
            }
            n+=1;
        }
        System.out.println(smallest);

    }
}
