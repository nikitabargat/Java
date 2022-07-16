import java.math.BigInteger;
import java.util.Scanner;

public class PowerOf2 {

    static int isPowerOfTwo(String A){

        BigInteger n = new BigInteger(A);

        if(n.compareTo(BigInteger.ONE) == 0 || n.compareTo(BigInteger.ZERO) == 0){
            return 0;
        }

        for(int i = 0; i< n.bitLength() - 1; i++){
            if(n.testBit(i)) return 0;
        }

        return n.testBit(n.bitLength()-1) ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        System.out.println(isPowerOfTwo(A));
        sc.close();
    }
}
