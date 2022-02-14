import java.util.Scanner;

public class trailingZeroesInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 0) System.out.println(-1);

        int count=  0;

        for(int  i =5; n/i >= 1; i *= 5){
            count += n/i;
        }

        System.out.println(count);
        sc.close();
    }
}
