import java.util.Scanner;

public class lengthOfLastWord {

    static int lenOfWord(final String A){

        int index = 0;

        String S = A.trim();

        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) == ' '){
                index = i;
            }
        }

        if(index == 0) return S.length();

        return S.length() - index - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        System.out.println(lenOfWord(A));
        sc.close();
    }
}
