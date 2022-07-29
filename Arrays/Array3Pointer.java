import java.util.ArrayList;
import java.util.Scanner;

public class Array3Pointer {

    static int minimumMax(final ArrayList<Integer> A, final ArrayList<Integer> B, final ArrayList<Integer> C) {

        int i = 0, j = 0, k = 0;
        int minVal, maxVal, ans = Integer.MAX_VALUE;

        while(i < A.size() && j < B.size() && k < C.size()) {
            minVal = Math.min(A.get(i), Math.min(B.get(j), C.get(k)));
            maxVal = Math.max(A.get(i), Math.max(B.get(j), C.get(k)));

            if(ans > maxVal - minVal) ans = maxVal - minVal;

            if(minVal == A.get(i)) i++;
            else if (minVal == B.get(j)) j++;
            else k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<m; i++){
            A.add(sc.nextInt());   
        }
        int n = sc.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i = 0; i<n; i++){
            B.add(sc.nextInt());   
        }
        int k = sc.nextInt();
        ArrayList<Integer> C = new ArrayList<>();
        for(int i = 0; i<k; i++){
            C.add(sc.nextInt());   
        }
        

        System.out.println(minimumMax(A, B, C));

        sc.close();
    }
}
