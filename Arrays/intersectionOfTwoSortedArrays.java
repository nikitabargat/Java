import java.util.ArrayList;
import java.util.Scanner;

public class intersectionOfTwoSortedArrays {

    static ArrayList<Integer> intersection( final ArrayList<Integer> A, final ArrayList<Integer> B) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0, j =0; 

        while(i < A.size() && j < B.size()) {
            if(A.get(i).equals(B.get(j))){
                res.add(A.get(i));
                i++;
                j++;
            }
            else if(A.get(i) < B.get(j)) i++;

            else  j++;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }
        int m = sc.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i = 0; i<m; i++){
            B.add(sc.nextInt());
        }

        System.out.println(intersection(A, B));

        sc.close();
    }
}
