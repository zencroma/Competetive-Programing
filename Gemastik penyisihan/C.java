import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int jumlah = in.nextInt();
		String[] hasil = new String[jumlah];
		for (int i = 0; i < jumlah; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			for (int j = 0; j < c; j++) {
				if(a<b) {
					b=b/2;
				}else {
					a=a/2;
				}
			}
			if(a>b) {
				hasil[i]= a +" " + b;
			}else {
				hasil[i]= b +" " + a;
			}
			
		}
		for (int i = 0; i < jumlah; i++) {
			System.out.println(hasil[i]);
		}

	}

}