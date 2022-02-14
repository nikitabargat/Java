import java.util.Scanner;

public class or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T --> 0){
            int n = sc.nextInt();

            // ways to write N as a sum of 3 numbers
            int ways = (n - 1) * (n - 2)/2;

            if(ways == 0) System.out.println(-1);

            else{
                System.out.println(ways);
            }
        }

        sc.close();
    }
}
