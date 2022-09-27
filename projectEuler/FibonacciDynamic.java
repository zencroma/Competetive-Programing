public class FibonacciDynamic {
    //Dynamic programming approach to fibonacci
    static long []fibonacci(long n){
        //konsep Dynamic programming 
        //mengingat hasil dari perhitungan untuk step selanjutnya
        long fib[] = new long[(int) (n+1)];
        int i ;

        fib[0] = 0;
        fib[1] = 1;
        //mempopulasi array dari i=2 sampai n dengan nilai fib
        for ( i = 2; i < fib.length; i++) {
            fib[i] = fib[i-2] + fib[i-1];
        }
        return fib;
    }

    static long []ifEven(long fib[]){
        long[] evenFib = new long[fib.length];
        for (int i = 0; i < evenFib.length; i++) {
            //mencari nilai fib yang even
            if (fib[i] % 2 ==0) {
                evenFib[i] = (int) fib[i];
            }
        }
        return evenFib;
    }
    public static void main(String[] args) {
        long n = 4000000;
        long arr []= ifEven(fibonacci(n));
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);
    }
}
