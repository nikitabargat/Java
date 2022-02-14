import java.util.Scanner;

public class binaryBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int count = 0;

            int r = 0, l = n-1;
            while(r <= l){
                if(s.charAt(r) != s.charAt(l)){
                    count++;
                }
                r++; l--;
            }

            // System.out.println(count);
            int rem = k - count;
            if(( rem >= 0 && rem % 2 == 0) || (rem >= 0 && n % 2 == 1)) 
                System.out.println("YES");

            else 
                System.out.println("NO");
        }

        sc.close();
    }
}
