import java.util.Scanner;

public class elsectionInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(A <= 50 && B <= 50 && C <= 50) System.out.println("NOTA");

            if(A > B && A > C && A > 50){
                System.out.println(A);
            }else if(B > A && B > C && B > 50){
                System.out.println(B);
            } else {
                System.out.println(C);
            }
        }
        sc.close();
    }
}
