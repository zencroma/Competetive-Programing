public class SumSquareDiff {
    public static void main(String[] args) {
        int batas=100;
        int total1=0;
        int total2=0;
        int diff =0;
        for (int i = 0; i <= batas; i++) {
            //menambahkan bilangan dibawah 100 yang sudah dikuadratkan 
            total1+=(int)Math.pow(i, 2);
        }
        for (int i = 0; i <=batas; i++) {
            //menambahkan bilangan semua yang berada di bawah 100
            total2+=i;

        }
        //hasil pangkat dari penambahan semua bilangan 100 dikurangi total 1 
        diff = total1-(int)Math.pow(total2, 2);
        System.out.println(diff);
    }
}
