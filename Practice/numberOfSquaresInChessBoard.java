import java.util.Scanner;

public class numberOfSquaresInChessBoard {

    static int numberOfSquares(int n){
        return (n * (n + 1) / 2) * (2 * n + 1) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of chess board: ");
        int n = sc.nextInt();

        System.out.println(numberOfSquares(n));
        sc.close();
    }
}
