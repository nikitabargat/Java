import java.util.Scanner;

public class StringRotation {

    static String leftRotate(String A, int B){

        String res = A.substring(B) + A.substring(0, B);

        return res;
    }

    static String rightRotate(String A, int B){
        return leftRotate(A, A.length() - B);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int B = sc.nextInt();
       
        System.out.println(leftRotate(A, B));
        System.out.println(rightRotate(A, B));
        sc.close();
    }
}
