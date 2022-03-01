
import java.util.Scanner;

public class sortedPermutationsRank {

    static int fact(int n){

        if ((n == 0) || (n == 1))    return (1);

        if (n < 0)   n = -n;

        int f = 1;
        while (n > 0){
            f *= n % 1000003;
            n -= 1;
        }
        return (f);
    }

    static int cntSmallerFromRight(String A, int s, int e){
        int count = 0;

        for(int i = s + 1; i <= e; i++){
            if(A.charAt(i) < A.charAt(s)) count++;
        }

        return count;
    }

    static int Rank(String A){

        int rank = 1;

        if(A.length() == 0 || A.length() == 1) return 1;

        for(int i = 0; i < A.length(); i++){
            rank += cntSmallerFromRight(A, i, A.length()-1) * fact(A.length() - i - 1);
        }

        return rank % 1000003;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println(Rank(s));
        sc.close();
    }
}
