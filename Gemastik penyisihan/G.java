import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int jumlah = in.nextInt();
        String[] desaa = new String[jumlah];
        String[] desab = new String[jumlah];
        long[] jawab = new long[jumlah];
		for (int i = 0; i < jumlah; i++) {
			String desa1 = in.next();
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
			String desa2 = in.next();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			
			long jawab1 = (long) Math.pow(x1-x2, 2) + (long) Math.pow(y1-y2, 2);
			long jawab2 = (long) Math.sqrt(jawab1);
			
            desaa[i] = desa1;
            desab[i] = desa2;
            jawab[i] = jawab2;
		}
        for (int i = 0; i < jumlah; i++){
            for (int j = 0; j < jumlah-i-1; j++){
                if (jawab[j] > jawab[j+1])
                {
                    long temp = jawab[j];
                    jawab[j] = jawab[j+1];
                    jawab[j+1] = temp;

                    String temp1 = desaa[j];
                    desaa[j] = desaa[j+1];
                    desaa[j+1] = temp1;

                    String temp2 = desab[j];
                    desab[j] = desab[j+1];
                    desab[j+1] = temp2;
                }
	
            }
        }
        for (int i = jumlah-1; i >= 0; i--) {
			System.out.println(desaa[i] + " " + desab[i] + " " + jawab[i]);
		}
    }
}
