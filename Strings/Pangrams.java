import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {

    static String isPangram(String s){

        s = s.toLowerCase();

        s = s.replaceAll(" ", "");

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            set.add(s.charAt(i));
        }

        if(set.size() != 26) return "not pangram";

        return "pangram";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(isPangram(s));

        sc.close();
    }
}
