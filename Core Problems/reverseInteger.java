import java.util.Scanner;

public class reverseInteger {

    static int reverse(int A){
        int rev = 0; // reversed number
        int rem;   // remainder
          
        while(A>0){
          rem = A%10;
          rev = (rev*10) + rem;
          A = A/10;
        }
          
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(reverse(n));
        sc.close();
    }
}
