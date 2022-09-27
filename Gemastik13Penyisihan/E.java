import java.util.Scanner;
class E2
{
    public static int hasil(int h[], int N) 
    { 
        int untung = 0;
        for (int i = 1; i < N; i++) {
            if (h[i] > h[i - 1])
                untung += h[i] - h[i - 1];
        }
        return untung;
    } 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int h[] = new int [N];
        for(int i=0;i<N;i++)
        {
            h[i] = in.nextInt();
        }
        System.out.println(hasil(h, N));
    }
}