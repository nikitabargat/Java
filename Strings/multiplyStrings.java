import java.util.Scanner;

public class multiplyStrings {

    static String multiply(String A, String B){

        String ans = "";

        int l1 = A.length(), l2 = B.length();

        if(l1 == 0 || l2 == 0) return "0";

        //to keep result in reverse order
        int[] res = new int[l1 + l2];

        //to track indexes in result;
        int n1 = 0, n2 = 0;

        int val;

        for(int i = l1 - 1; i>=0; i--){

            int carry = 0;
            n2 = 0;

            for(int j = l2 - 1; j>=0; j--){
                val = ((A.charAt(i) - '0') *( B.charAt(j) - '0')) + res[n1 + n2] + carry;

                carry = val / 10;

                res[n1 + n2] = val % 10;

                n2++;
            }
            if(carry > 0) res[n1 + n2] += carry;

            n1++;
        }

        int i = res.length - 1;
        while(i >= 0 && res[i] == 0) i--;

        if(i == -1) return "0";

        while(i >= 0)
            ans += res[i--];

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(multiply(A, B));

        sc.close();
    }
}
