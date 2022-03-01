import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cityTour {

    static int mod = 1000000007;

    static long power(long x, long y){
        if(y == 0) return 1;
        if(y == 1) return x;

        long temp = power(x, x/2)%mod;

        if(y % 2 == 0) return temp*temp % mod;
        
        return ((((x * temp) % mod) * temp) % mod) % mod;
    }

    static int fact(int n){
        return (n == 0 || n == 1) ? 1 : n * fact(n - 1) % mod;
    }

    static int ways(int A, ArrayList<Integer> B){

        Collections.sort(B);

        // no. of unvisited cities
        int N = A - B.size();

        // Calculate all gaps
        ArrayList<Integer> unvisited = new ArrayList<>();
        unvisited.add(B.get(0) - 1);
        for(int i = 1; i<B.size(); i++){
            unvisited.add(B.get(i) - B.get(i-1) - 1);
        }
        unvisited.add(A + 1 - B.get(B.size() - 1) - 1);

        // 1st term of answer
        int count = fact(N);
        for(int i = 0; i<unvisited.size(); i++){
            count *= power(fact(unvisited.get(i)), 1000000005) % mod;
            count %= mod;
        }

        // no. of ways to access internal gaps
        int i_gaps = 1;
        for(int i = 0; i < unvisited.size(); i++){
            if(i == 0 || i == unvisited.size() - 1)
                i_gaps *= 1;
            else if(unvisited.get(i) < 2) 
                continue;
            else{ 
                i_gaps *= power(2, unvisited.get(i) - 1);
                i_gaps %= mod;
            }
        }

        count *= i_gaps % mod;

        return count % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<Integer> B = new ArrayList<>();
        for(int i = 0; i<n; i++){
            B.add(sc.nextInt());
        }

        System.out.println(ways(A, B));

        sc.close();
    }
}
