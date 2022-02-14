import java.util.Scanner;

public class largestCoprimeDivisor {

    static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a % b);
    }

    static int cpFact(int A, int B){

       while (gcd(A, B) != 1){
           A /= gcd(A, B);
       }

        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(cpFact(a, b));
        sc.close();                
    }
}
