public class stPrimenumber {
    public static void main(String[] args) {
        int place = 6;
        int i = 14;
        int temp = 0;
        boolean prime; 
        while (place < 10001) {
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
                place++;
            }
            i++;
        }
        System.out.println("Prime 10 001st is: " + (i-1));       
    }
}
