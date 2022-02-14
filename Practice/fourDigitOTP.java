import java.util.Scanner;

public class fourDigitOTP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String res = "";
        for(int i = 1; i<n.length(); i+=2){
            int num = n.charAt(i) - '0';
            res += Integer.toString((int)Math.pow(num, 2));
        }
        System.out.println(res);

        if(res.length() < 4) System.out.println("-1");

        else System.out.println(res.substring(0, 4));

        sc.close();
    }
}
