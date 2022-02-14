import java.util.ArrayList;
import java.util.Scanner;

// Logic --> numbers can have only three numbers as their divisor and also that includes 1 and that number itself resulting into just a single divisor other than a number, so we can easily conclude that required are those numbers which are squares of prime numbers so that they can have only three divisors (1, the number itself and sqrt(number)).

public class threeDivisors {

    public static boolean isPrime(int n)
    {
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static ArrayList<Integer> divisors(ArrayList<Long> query, int q){
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i<= query.size(); i++){
            for(int j = 2; j*j<= query.get(i); j++){
                if(isPrime(j)){
                    if(j*j <= query.get(i)){
                        res.add(j);
                    }
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        ArrayList<Long> query = new ArrayList<>();
        for(int i = 0; i<q; i++){
            query.add(sc.nextLong());
        }

        System.out.println(divisors(query, q));
        sc.close();
    }
}
