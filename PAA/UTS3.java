
/**
 * UTS3
 */

import java.util.*;

public class UTS3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int [] h = new int [n];
        int [] w = new int [n];
        int [] hargaDibagiWeight = new int[n];
        for (int i = 0;i< hargaDibagiWeight.length;i++) {
            System.out.print("masukan harga: ");
            h[i] = in.nextInt();
            System.out.print("masukan berat: ");
            w[i] = in.nextInt();
            hargaDibagiWeight[i] = h[i] / w[i];
        }

        for (int i = 0; i < hargaDibagiWeight.length-1; i++) {
            for (int j = 0; j < hargaDibagiWeight.length-i-1; j++) {
                if (hargaDibagiWeight[j]>hargaDibagiWeight[j+1]) {
                    swap(h, j, j+1);
                    swap(w,j,j+1);
                    swap(hargaDibagiWeight,j,j+1);
                }
            }
        }

        for (int i = 4; i >=0; i--) {
            System.out.println("Kambing yang mempunyai keuntungan maksimal adalah kambing yang memiliki berat "+w[i]+" kg dan memiliki harga "+h[i]);
        }
    }

    static void swap(int[] arr,int a, int b) {
        int temp = arr[a];
        arr [a] = arr [b];
        arr [b] = temp;
    }
}