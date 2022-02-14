import java.util.Arrays;
import java.util.Scanner;

public class seiveOfEratosthenes {
    static void isPrime(int n){
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime, true);

        for(int p = 2; p*p <= n; p++){
            if(prime[p] == true){
                for(int i = p*p; i<=n; i+=p){
                    prime[i] = false;
                }
            }
        }
        for(int i = 2; i<=n ;i++){
            if(prime[i] == true){
                System.out.print(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isPrime(n);

        sc.close();
    }
}
