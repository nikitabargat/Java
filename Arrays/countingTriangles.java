import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class countingTriangles {

    static int trianglesCount(ArrayList<Integer> A) {

        if(A.size() < 3) return 0;
        int mod  = 1000000007;
        Collections.sort(A);
        int count = 0 ;

        for(int i = A.size() - 1; i >= 1; i--) {
            int l = 0;
            int r = i - 1;

            while(l < r) {
                long sum = A.get(l) + A.get(r);
                if(sum > A.get(i)) {
                    count = (count + (r-l) % mod) % mod;
                    r--;
                } else 
                    l++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());   
        }

        System.out.println(trianglesCount(A));

        sc.close();
    }
}
