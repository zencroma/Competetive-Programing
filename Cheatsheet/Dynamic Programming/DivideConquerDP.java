

public class DivideConquerDP {
    // Function to find the minimum sum
    public static int solve(int arr[], int N, int M)
    {
        int pref[] = new int[N + 1];
        int dp[][] = new int[M + 1][N + 1];
 
        // Prefix sum array
        pref[0] = 0;
        for (int i = 0; i < N; i++)
            pref[i + 1] = pref[i] + arr[i];
 
        // Initialize the dp array
        for (int i = 0; i < N; i++)
            dp[0][i] = pref[i + 1] * pref[i + 1];
 
        // Fill in the dp array
        for (int i = 1; i < M; i++) {
            for (int j = i; j < N; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 1; k <= j; k++) {
                    int cost = (pref[j + 1] - pref[k])
                               * (pref[j + 1] - pref[k]);
 
                    // dp transition
                    dp[i][j] = Math.min(
                        dp[i][j], dp[i - 1][k - 1] + cost);
                }
            }
        }
 
        return dp[M - 1][N - 1];
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int N, M = 3;
        int arr[] = { 1, 3, 2, 6, 7, 4 };
        N = arr.length;
 
        // Function call
        System.out.print(solve(arr, N, M));
    }
}
 
