import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int Q = in.nextInt();
        int [] operasi = new int [Q];
        int [] hadiah = new int[Q];
        int [] Xfav = new int [Q];
        int [] Yfav = new int[Q];
        int N = 0;
        int X = 0;
        int Y = 0;
        for (int i = 0; i < Q; i++) {
            hadiah[i] = N = in.nextInt();
            Xfav[i]=X = in.nextInt();
            Yfav[i]=Y = in.nextInt();
        }
        for (int j = 1; j < N+1; j++) {
            int saveX = 0;
            int saveY = 0;
            if(j%X==0 && j%Y==0){
            }else if(j%X==0 || j%Y==0){
                if(j%X==0){
                    saveX++;
                }
                if(j%Y==0){
                    saveY++;
                }
            }
            System.out.println(saveX+" "+saveY);
        }
    }
}