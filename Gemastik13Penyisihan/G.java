import java.util.Scanner;

public class G2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int M = in.nextInt();
            int count = 1;
            int TB = 0;
            int US = 0;
            boolean cektb = true;
            boolean cekus = true;
            while(M>0){
                if(count%2!=0){
                    if(cektb == true){
                        for (int j = 0; j < count; j++) {
                            if (M>0){
                                TB++;
                                M--;
                                cektb = false;
                            }else{
                                break;
                            }
                        }
                    }else{
                        for (int j = 0; j < count; j++) {
                            if (M>0){
                                TB--;
                            M--;
                            cektb = true;
                            }else{
                                break;
                            }
                        }
                    }
                } else{
                    if(cekus == true){
                        for (int j = 0; j < count; j++) {
                            if (M>0){
                                US++;
                                M--;
                                cekus = false;
                            }else{
                                break;
                            }
                        }
                    }else{
                        for (int j = 0; j < count; j++) {
                            if (M>0){
                                US--;
                                M--;
                                cekus = true;
                            }else{
                                break;
                            }
                        }
                    }
                }
                count++;
            }
            System.out.println(TB +" "+ US);
        }
    }
}
