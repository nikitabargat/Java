import java.util.Scanner;

/* lps --> Longest Proper Prefix which is also Suffix */

public class KMPalgorithm {

    static int[] LPSArray(String B){

        int[] lps = new int[B.length()];
        int len = 0;   //length of previous longest prefix sufix.

        lps[0] = 0;
        int i = 1;

        while(i < B.length()){
            if(B.charAt(i) == B.charAt(len)){
                len++;
                lps[len] = len;
                i++;
            } else{
                if(len != 0){
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }

        return lps;
    }

    static int kmp(String A, String B){

        int[] lps = LPSArray(B);
        int res = 0;

        int j = 0;    //index for string B.
        int i = 0;    // index for string A.

        while(i < A.length()){
            if(B.charAt(j) == A.charAt(i)){
                j++; i++;
            } 
            
            if(j == B.length()){ 
                res =  i-j;
                j = lps[j - 1];
            }
            else if(i < A.length() && B.charAt(j) != A.charAt(i)) {
                if( j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(kmp(A, B));

        sc.close();
    }
}
