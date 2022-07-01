import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prettyprint {

    static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        
        int n = A * 2 - 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
         
        Integer a[] = new Integer[n];

        for (int i = 0; i < A; i++) {

            for (int j = i; j < n - i; j++) {
                a[j] = A - i;
            }
            result.add(new ArrayList<Integer>(Arrays.asList(a)));
        }


        for (int i = A - 2; i >= 0; i--) {

            for (int j = i; j < n - i; j++) {
                a[j] = A - i;
            }
            result.add(new ArrayList<Integer>(Arrays.asList(a)));
        }
         
        return result;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(prettyPrint(n));

        sc.close();
    }
}
