import java.util.ArrayList;
import java.util.Scanner;

class longestCommonPrefix{

    static int findMinLength(ArrayList<String> A, int n){
        int min = A.get(0).length();
 
        for (int i = 1; i < n; i++) {
            if (A.get(i).length() < min) {
                min = A.get(i).length();
            }
        }
 
        return min;
    }

    static String commonPrefix(ArrayList<String> A){
        
        int minlen = findMinLength(A, A.size());
 
        String result = ""; // Our resultant string
        char current; // The current character
 
        for (int i = 0; i < minlen; i++) {
            current = A.get(0).charAt(i);
 
            for (int j = 1; j < A.size(); j++) {
                if (A.get(j).charAt(i) != current) {
                    return result;
                }
            }
            result += current;
        }
 
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.next());
        }

        System.out.println(commonPrefix(A));

        sc.close();
    }
}