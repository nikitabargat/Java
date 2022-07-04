import java.util.Scanner;

public class palindromeString {

    static int isPalindrome(String A){
        A = A.replaceAll("[^a-zA-Z0-9]", "");
        A =  A.toLowerCase();

        String B = "";

        for(int i = A.length() - 1; i>= 0; i--){
            B += A.charAt(i);
        }

        if(A.equals(B)) return 1;

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        System.out.println(isPalindrome(A));

        sc.close();
    }
}
