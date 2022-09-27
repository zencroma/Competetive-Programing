import java.util.*;

public class C {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int n = in.nextInt(), m = in.nextInt();
    int l = in.nextInt();
    int x1,x2,y1,y2;
    int jumlah = 0;

    int [][]matrix = new int[n][m];

    for(int i = 0; i < n;i++){
      for(int j = 0; j < m;j++){
        matrix[i][j] = in.nextInt();
      }
    }
    for(int k = 1; k<= l;k++){
      x1 = in.nextInt();
      y1 = in.nextInt();
      x2 = in.nextInt();
      y2 = in.nextInt();

      for(int i = x1-1 ; i < x2; i++){
        for(int j = y1-1; j < y2; j++){
          jumlah += matrix[i][j];
        }
      }
      System.out.println(jumlah);
      jumlah = 0;
    }
  }
}