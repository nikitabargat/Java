import java.util.Scanner;

public class sortedPermutationsWithReapeats {

    private static int M = 1000003;

    // static long fact(long n){

    //     if ((n == 0) || (n == 1))    return (1);

    //     if (n < 0)   n = -n;

    //     long f = 1;
    //     while (n > 0){
    //         f *= n % 1000003;
    //         n -= 1;
    //     }
    //     return (f);
    // }

    // static int Rank(String A){
        
    //     long rank = 1;

    //     for(int i = 0; i< A.length(); i++){

    //         // count smaller characters than A[i]
    //         long count = 0;
    //         for(int j = i + 1; j < A.length(); j++){
    //             if(A.charAt(i) > A.charAt(j)) count ++;
    //         }

    //         // count frequency of duplicate characters
    //         long[] dupCount = new long[52];
    //         for(int j = i; j<A.length(); j++){
    //             if(A.charAt(j) >= 'A' && A.charAt(j) <= 'Z') { dupCount[A.charAt(j) - 'A']++ ; }

    //             else dupCount[A.charAt(j) - 'a' + 26]++;
    //         }

    //         // Compute product of fact of frquency
    //         long dupFact = 1;
    //         for(long ele : dupCount){
    //             dupFact *= fact(ele);

    //             rank += (fact(A.length() - i - 1) * count) / dupFact;
    //         }
    //     }

    //     return (int) rank;
    // }

    static long modExp(long x, long y){
        long res = 1;
	
	    while (y > 0) {
	        if ((y & 1) == 1) {
	            res = (res * x) % M;
	        }
	        x = (x * x) % M;
	        y >>= 1;	    
	    }
	    
	    return res;
    }

    static int charNumber(char ch){
        if(ch <= 'Z') return ch - 'A';

        else return ch - 'a' + 26;
    }

    static int Rank(String A){
        int n = A.length();

        long[] facts = new long[n+1];
        long[] infacts = new long[n+1];

        facts[0] = infacts[0] = 1;

        for(int i = 1; i<= n; i++){
            facts[i] = facts[i - 1] * i % M;
            infacts[i] = modExp(facts[i], M - 2);
        }

        int[] c = new int[52];
        for(char ch : A.toCharArray()){
            c[charNumber(ch)]++;
        }

        long rank = 0;
        int count = n;
        for(char ch : A.toCharArray()){
            count--;
            for(int j = 0; j<charNumber(ch) ; j++){
                if(c[j] > 0){
                    c[j]--;
                    long trank = facts[count];
                    //System.out.println("t" + trank);
                    for (int i = 0; i < 52; i++) {
                        if (c[i] > 0) {
                            trank = (trank * infacts[c[i]]) % M;
                            //System.out.println("t" + trank);
                        }
                    }
                    rank = (rank + trank) % M;
                    //System.out.println("r" + rank);
                    c[j]++;
                }
            }
            c[charNumber(ch)]--;
        }
        return (int) (rank + 1) % M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println(Rank(s));
        sc.close();
    }
}
