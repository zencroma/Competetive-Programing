/**
 * A
 */
import java.util.*;
public class A {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int jumlahBilangan = in.nextInt();
        int Q = in.nextInt();
        int [] Himpunan = new int[jumlahBilangan];
        for (int i = 0; i < Himpunan.length; i++) {
            Himpunan[i] = in.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int turn =0;
            int lastTurn =0;
            int batu = in.nextInt();
            int ambil =0;
            int himp = 0;
            while (batu >= 0) {
                if (turn == 1){
                    turn = 2;
                    lastTurn = turn;
                    himp = rand.nextInt(jumlahBilangan);
                    ambil = Himpunan[himp];
                    batu -= ambil;
                }else{
                    turn = 1;
                    lastTurn = turn;
                    himp = rand.nextInt(jumlahBilangan);
                    ambil = Himpunan[himp];
                    batu -= ambil;
                }
            }
            if (lastTurn==1) {
                System.out.println("Elon");
            } else {
                System.out.println("Melvin");
            }
        }
    }
}