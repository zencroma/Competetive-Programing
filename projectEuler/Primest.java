import java.util.*;
public class Primest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah = in.nextInt();
        int num = 0;
        while(jumlah<=10001){
            for (int i = 0; i <= ; i++) {
                int counter = 0;
                for (num =i; num>=1; num--) {
                    if (i%num==0) {
                        counter+=1;
                    }
                }
                if (counter==2) {
                    System.out.print(i+" ");
                    jumlah++;
                }
                if () {
                    
                }
            }
        }
        System.out.println();
        System.out.println("Jumlah prime: "+jumlah);
    }
}
