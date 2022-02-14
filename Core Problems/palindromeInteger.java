
import java.util.Scanner;

public class palindromeInteger {

    static int isPalindrome(int A){

        if(A<0) return 0;
        
        int copy = A;
        int rev = 0;
        
        while (A>0) {
            rev = rev*10 + A%10;
            A /= 10;
        }
        
        return rev == copy ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
        sc.close();
    }
}
