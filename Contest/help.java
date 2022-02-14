import java.util.Scanner;

public class help {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T --> 0){
            int n = sc.nextInt();

            int red = 0, blue = 0;

            for(int i = 2; i<=n; i+=2){
                red += i;
            }
            for(int i = 1; i<=n; i+=2){
                blue += i;
            }

            System.out.println(red);
            System.out.println(blue);
        }
        sc.close();
    }
}
