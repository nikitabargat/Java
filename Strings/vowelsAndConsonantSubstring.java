import java.util.Scanner;

public class vowelsAndConsonantSubstring {

    static int isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u')
            return 1;

        else 
            return 0;
    }
    static int countSubstring(String A){

        long count = 0;

        long mod = 1000000007;

        if(A.length() <= 1) return 0;

        int vow = 0, cons = 0;

        for(int i = 0; i<A.length(); i++){
            char ch = A.charAt(i);
            vow += isVowel(ch);
        }

        cons = A.length() - vow;

        for(int i = 0; i<A.length(); i++){
            char ch = A.charAt(i);

            if(isVowel(ch) == 1){
                vow--;
                count += cons%mod;
            } else {
                cons--;
                count += vow%mod;
            }
        }
        
        return (int)(count%mod);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        System.out.println(countSubstring(A));

        sc.close();
    }
}
