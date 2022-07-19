import java.util.Scanner;

public class makeStringPalindrome {

    /* using lps array of KMP algorihthm */

    static int[] computeLPSArray(String A){
        int lps[] = new int[A.length()];

        int i = 1, len = 0;

        lps[0] = 0;

        while(i < A.length()){
            if(A.charAt(i) == A.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    static String minimumCharacters(String A){

        StringBuilder s = new StringBuilder();
        s.append(A);

        String rev = s.reverse().toString();
        s.reverse().append("$").append(rev);

        int lps[] = computeLPSArray(s.toString());

        int val = lps[s.length() - 1];
        return  A.substring(0, val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.println(minimumCharacters(A));
        sc.close();
    }
}
