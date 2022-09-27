public class SummationPrimes {
    public static void main(String[] args) {
        int i = 2;
        int temp = 0;
        boolean prime; 
        long total=0;
        while (i < 2000000) {
            temp=(int)Math.sqrt(i);
            //cek prima atau nggak
            prime = true;
            for (int j = 2; j <= temp; j++) {
                if (i%j==0) {
                    prime = false;
                    break;
                }
            }
            //ganti bilangan prima terakhir
            if (prime) {
                System.out.print(i+ " ");
                total+=(long)i;
            }

            i++;
        }
        System.out.println("Prime 10 001st is: " + (i-1));
        System.out.println("summation = "+total);     
    }
}
