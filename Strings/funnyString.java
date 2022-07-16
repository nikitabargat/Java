import java.util.Arrays;
import java.util.Scanner;

public class funnyString {

    static String isFunnyOrNot(String s){

        int[] arr1 = new int[s.length()];
        int[] arr2 = new int[s.length()];

        int i=0, j = s.length()-1;
        while(i < s.length() && j > 0){
            arr1[i] += Math.abs((int) s.charAt(i) - s.charAt(i+1));
            arr2[i] += Math.abs((int) s.charAt(j) - s.charAt(j-1));

            i++; j--;
        }

        if(Arrays.equals(arr1, arr2)){
            return "Funny";
        }
        
        return "Not Funny";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(isFunnyOrNot(s));

        sc.close();
    }
}
