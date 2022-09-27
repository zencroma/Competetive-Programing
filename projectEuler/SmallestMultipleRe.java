public class SmallestMultipleRe {
    public static int GCD(int a , int b ) {
        if (a%b==0) {
            return b;
        }else {
            return GCD(b, a%b);
        }
    }
    public static int LCM(int a,int b) {
        return a/GCD(a, b)*b;
    }
    public static void main(String[] args) {
        int angka = 1;
        for (int i = 1; i <=20; i++) {
            angka  = LCM(angka,i);
        }
        System.out.println(angka);
    }

}
