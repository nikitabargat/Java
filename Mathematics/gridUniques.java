import java.util.Scanner;

public class gridUniques {
    static int uniquePath(int A, int B){

        if(A == 1 || B == 1) return 1;
        return uniquePath( A - 1, B) + uniquePath(A, B - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(uniquePath(A, B));

        sc.close();
    }
}
