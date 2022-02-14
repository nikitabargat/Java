import java.util.Scanner;

public class averageWithoutOverflow {

    static int average(int a ,int b){
        return (a/2) + (b/2) + ((a % 2 + b % 2) / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(average(a, b));

        sc.close();
    }
}
