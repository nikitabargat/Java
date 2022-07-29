
import java.util.Scanner;

public class ReverseTheString {

    /*without extra trailing spaces */
    static String reverse1(String A){

        String result = "";

        String[] str = A.split(" ");

        for(int i = str.length-1; i >= 0; i--){
            result += str[i] + " ";
        }
       
        return result;
    }

    /* with extra trailing spaces */
    /* method - 1*/
    static String reverse2(String A){
        int idx = A.length() - 1;
        StringBuilder sb = new StringBuilder();

        while(idx >= 0 && A.charAt(idx) == ' ') 
            idx--;

        StringBuilder temp = new StringBuilder();
        while(idx >= 0) {
            if(A.charAt(idx) == ' '){
                if(temp.length() > 0){
                    sb.append(temp.reverse().toString()).append(" ");
                    temp.setLength(0);
                }
            } else {
                temp.append(A.charAt(idx));
            }
            idx--;
        }

        if(temp.length() > 0){
            sb.append(temp.reverse().toString());
        }

        return sb.toString().trim();
    }

    /* method - 2 */
    static String reverse3(String A){
        String ans = "";

        int i = A.length() - 1;

        while(i >= 0){

            while( i >= 0 && A.charAt(i) == ' ') i--;

            int j = i;

            while(i >= 0 && A.charAt(i) != ' ') i--;

            if(ans.isEmpty()) {
                ans = ans.concat(A.substring(i+1, j+1));
            } else {
                ans = ans.concat(" " + A.substring(i+1, j+1));
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        System.out.println(reverse1(A));
        System.out.println(reverse2(A));
        System.out.println(reverse3(A));
        sc.close();
    }
}
