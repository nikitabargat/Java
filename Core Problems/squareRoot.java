import java.util.Scanner;

public class squareRoot {

    static double sqrt(int n, int p){
        int s = 0 , e = n;

        double root = 0.0;

        while(s <= e){
            int mid = s + (e - s)/2;

            if(mid * mid == n){
                return mid;
            }

            if(mid * mid > n){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        double incr = 0.1;

        for(int i = 0; i < p; i++){
            while( root * root <= n){
                root += incr;
            }

            root -= incr;

            incr /= 10;
        }

        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(sqrt(n, p));

        sc.close();
    }
}
