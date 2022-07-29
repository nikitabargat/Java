import java.util.Scanner;

public class ZigZagString {

    static String conversion(String A, int B) {

        if(B == 1) return A;

        StringBuilder sb = new StringBuilder();

        int i; 
        boolean up ;

        for(int row = 0; row < B; row++){

            i = row;
            up = true;

            while(i < A.length()) {
                sb.append(A.charAt(i));

                if(row == 0 || row == B - 1) {
                    i += (2 * B - 2);
                } else {
                    if(up) 
                        i += (2 * (B - row) - 2);
                    else
                        i += row * 2;
                }

                up ^= true;
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int B = sc.nextInt();

        System.out.println(conversion(A, B));
        sc.close();
    }
}
