import java.util.Scanner;

public class nqueenpuzzlesolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();
            
            double ans = Math.pow(((0.143) * n), n);
            
            if(ans - Math.floor(ans) < 0.5) 
                System.out.println((int)Math.floor(ans));
            else
                System.out.println((int)Math.ceil(ans));
        }
        sc.close();
    }
}
