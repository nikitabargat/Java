import java.util.Scanner;

public class addBinaryString {

    static String add(String A, String B){
        StringBuilder res = new StringBuilder();

        int i = A.length()-1, j = B.length()-1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0){
            int val = carry;
            if(i >= 0) 
                val += Character.getNumericValue(A.charAt(i--));

            if(j >= 0)
                val += Character.getNumericValue(B.charAt(j--));

            carry = val > 1 ? 1 : 0;
            val = val > 1 ? (val == 2 ? 0 : 1) : val;
            res.append(val);
        }

        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(add(A, B));

        sc.close();
    }
}
