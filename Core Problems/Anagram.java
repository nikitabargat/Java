// import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Anagram{

    static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        
        // loop over s1
        for(int i = 0; i<s1.length(); i++){
            if(map.containsKey(s1.charAt(i)))
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            else
                map.put(s1.charAt(i), 1);
        }

        // loop over s2
        for(int i = 0; i<s2.length(); i++){
            if(map.containsKey(s2.charAt(i)))
                map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
        }

        Set<Character> keys = map.keySet();

        for(Character key : keys){
            if(map.get(key) != 0) 
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        
        // char[] s1 = sc.next().toCharArray();
        // char[] s2 = sc.next().toCharArray();

        // String ans = "Is an anagram";

        // if( s1.length != s2.length) ans = "Not an anagram";

        // // Sort both Strings
        // Arrays.sort(s1);
        // Arrays.sort(s2);

        // // Compare
        // for(int i = 0; i<s1.length; i++){
        //     if(s1[i] != s2[i])
        //         ans = "Not an anagram";
        // }
        // System.out.println(ans);

        System.out.println(isAnagram(s1, s2));
        sc.close();
    }
}