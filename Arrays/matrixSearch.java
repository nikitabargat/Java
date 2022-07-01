import java.util.ArrayList;
import java.util.Scanner;

public class matrixSearch {

    static int BST(ArrayList<Integer> A, int B){
        int l = 0, r = A.size()-1;
        while(r >= l){
            int mid = l + (r - l)/2;

            if(A.get(mid) == B) return mid;

            else if (B < A.get(mid)) 
                return r = mid--;
            
            else 
                return l = mid++;
        }
        return -1;
    }

    static int searchMatrix(ArrayList<ArrayList<Integer>> A, int B){
        if(A.size() == 0 || A.get(0).size() == 0) return 0;

        int start = 0, end = A.size() - 1;
        while(start <= end){
            int mid = (start + end)/2;

            if(A.get(mid).get(0) > B) end = mid--;

            else {
                int tempIndx = BST(A.get(mid), B);
                if(tempIndx != -1) return 1;
                start = mid++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int B = sc.nextInt();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(new ArrayList<>());
            for(int j =0; j< n; j++){
                A.get(i).add(sc.nextInt());
            }
        }

        System.out.println(searchMatrix(A, B));

        sc.close();
    }
}
