import java.util.Scanner;

public class longestCommonSubsequence {

    /* -------- Recursion ------- */

    static int LCS(char[] a, char[] b , int m, int n){     

        if(m == 0 || n == 0) return 0;

        else if(a[m-1] == b[n-1]) return 1 + LCS(a, b, m-1 ,n-1);

        else return Math.max(LCS(a, b, m, n-1), LCS(a, b, m-1, n));
    }

    /*---------- Memoization ----------- */

    static int MemoLCS(String A, String B) {

        char a[] = A.toCharArray();
        char b[] = B.toCharArray();

        int[][] dp = new int[a.length+1][b.length+1];

        for(int i = 0; i<=a.length; i++){
            for(int j = 0; j<=b.length; j++){

                if(i == 0 || j == 0) 
                    dp[i][j] = 0;

                else if(a[i-1] == b[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        for(int i = 0; i< a.length+1; i++){
            for(int j = 0; j<b.length+1; j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
      
        return dp[A.length()][B.length()];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println( MemoLCS(A, B));

        sc.close();
    }
}
