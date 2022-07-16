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

    static int minimumCharacters(String A){

        StringBuilder s = new StringBuilder();
        s.append(A);

        String rev = s.reverse().toString();
        s.reverse().append("$").append(rev);

        int lps[] = computeLPSArray(s.toString());

        return A.length() - lps[s.length() - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        System.out.println(minimumCharacters(A));
        sc.close();
    }
}
