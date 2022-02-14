import java.util.Scanner;

public class playground {
    static int factorial(int n){
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(factorial(m+n-1));

        sc.close();
    }
}
