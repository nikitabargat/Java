import java.util.Scanner;

public class strStr {

    /* ---- Using standard library functions ---- */
    static int StrStr1(final String A, final String B){

        if(A.length() == 0 || B.length() == 0) return -1;
        else if(A.contains(B)) return A.indexOf(B);
        return -1;
    }

    /* ----- without using standard library function ------ */
    static int StrStr2(final String A, final String B){

        int counter = 0;

        int i = 0;
        for(; i< A.length(); i++){
            if(counter == B.length()) break;

            if(B.charAt(counter) == A.charAt(i)) counter++;

            else {
                if(counter > 0)
                    i -= counter;
                
                counter = 0;
            }
        }
        return counter < B.length() ? -1 : i - counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(StrStr1(A, B));
        System.out.println(StrStr2(A, B));
        
        sc.close();
    }
}
