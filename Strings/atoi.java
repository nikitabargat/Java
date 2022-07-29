import java.util.Scanner;

class atoi {

    static int convert(final String A) {

        int sign = 1 , i = 0;
        long num = 0;
        
        if(i == A.length()) return 0;

        while(i < A.length() && A.charAt(i) == ' ') i++;

        if(A.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (A.charAt(i) == '+') {
            i++;
        }

        while(i < A.length() && A.charAt(i) >= 0 && A.charAt(i) <= '9') {
            num = Math.abs(num);

            num *= 10 + A.charAt(i)-'0';

            if(sign == -1) num = -num;

            if(num > Integer.MAX_VALUE) 
                return Integer.MAX_VALUE;

            else if (num < Integer.MIN_VALUE) 
                return Integer.MIN_VALUE;

            i++;
        }

        return (int) num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        System.out.println(convert(A));

        sc.close();
    }
}