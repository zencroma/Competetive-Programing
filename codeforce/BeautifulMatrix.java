import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] matrix = new int[5][5];
        int posisiI = 0;
        int posisiJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = in.nextInt();

                if(matrix[i][j] == 1) {
                    posisiI = i;
                    posisiJ = j;
                }
            }
        }       
        // System.out.println(posisiI + " " + posisiJ);
        int positionBeautiful = Math.abs(posisiI - 2 ) + Math.abs(posisiJ - 2);
        System.out.println(positionBeautiful);  

    }
}
