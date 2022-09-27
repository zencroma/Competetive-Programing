public class SpecialPythagoras {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int m = 2;
        while (a + b + c != 1000) {
            for (int n = 1; n < m; n++) {
                a = m*m - n*n;
                b = 2*m*n;
                c = m*m + n*n;
                //System.out.println(a+b+c);
                if (a + b + c == 1000) {
                    break;
                }
            }
            m++;
        }
        System.out.println(a*b*c);
    }  
}
