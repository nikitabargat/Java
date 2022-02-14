import java.util.Scanner;

public class additionWithoutSummation {

    static int addNumbers(int A, int B){

        while(B != 0){
            // carry is AND of tow bits
            int carry = A & B;

            // sum of  two bits is XOR
            A = A ^ B;

            // shifts carry to 1 bit to add number
            B = carry << 1;
        }

        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(addNumbers(A, B));
        sc.close();
    }
}
