import java.util.Scanner;

public class bitManipulation {
    static int getBit(int n, int pos){
        return ((n & (1 << pos)) != 0) ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        getBit(n, pos);
        sc.close();
    }
}
