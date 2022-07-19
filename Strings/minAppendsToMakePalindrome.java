import java.util.Scanner;

public class minAppendsToMakePalindrome {

    static String minimumCharacters(String A){
        int i = 0, j = A.length() - 1;
        int k = 0;

        while(i < j){
            if(A.charAt(i) == A.charAt(j)) {
                i++; j--;
            } else {
                k++;
                i = k;
                j = A.length() - 1;
            }
        }
        return A.substring(k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.println(minimumCharacters(A));
        sc.close();
    }
}
