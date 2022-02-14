import java.util.Scanner;

public class numOfOpenDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println((int) Math.sqrt(n));

        sc.close();
    }
}
