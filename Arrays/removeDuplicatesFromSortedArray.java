import java.util.ArrayList;
// import java.util.HashMap;
import java.util.Scanner;

public class removeDuplicatesFromSortedArray {

    static int removeDuplicates(ArrayList<Integer> A) {
       
        int i = 0;

        for(int j = 1; j < A.size(); j++) {

            if(!A.get(i).equals(A.get(j))) {
                i++;
                A.set(i, A.get(j));
            }
        }

        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }

        System.out.println(removeDuplicates(A));

        sc.close();
    }
}
