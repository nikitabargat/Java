import java.util.Scanner;

public class IntegertoRoman {

    static String convertToRoman(int A){

        String romans[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int numerals[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder res = new StringBuilder();

        int i = 0;

        while(A != 0){
            if(A >= numerals[i]){
                A -= numerals[i];
                res.append(romans[i]);
            } else {
                i++;
            }
        }

        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        System.out.println(convertToRoman(A));

        sc.close();
    }
}
