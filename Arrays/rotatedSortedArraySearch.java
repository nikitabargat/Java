import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rotatedSortedArraySearch {

    static int findPivot(final List<Integer> A, int l, int r){
        // base case
        if(l < r) return -1;

        else if(l == r) return r;

        int mid = l + (r - l)/2;

        if(mid < r && A.get(mid) > A.get(mid + 1))
            return mid;
        
        else if(mid > l && A.get(mid) < A.get(mid - 1))
            return mid - 1;

        else if(A.get(l) >= A.get(mid)) 
            return findPivot(A, l, mid - 1);
        
        else return findPivot(A, mid + 1, r);
    }

    static int pivotBinarySearch(final List<Integer> A, int B){
        int pivot = findPivot(A, 0, A.size() - 1);

        // If we not found pivot , that means the array is not rotated at all 
        if(pivot == -1) return BST(A, 0, A.size() - 1, B);

        else if(A.get(pivot) == B) return pivot;

        else if(A.get(0) <= B) return BST(A, 0, pivot - 1, B);

        else return BST(A, pivot + 1, A.size() - 1, B);
    }

    static int BST(final List<Integer> A, int l, int r, int B){
        if(r < l) return -1;

        while(r >= l){
            int mid = l + (r - l)/2;

            if(A.get(mid) == B) return mid;

            if(B == A.get(mid)) return mid;

            else if (B < A.get(mid)) 
                return BST(A, l, mid - 1, B);
            
            else 
                return BST(A, mid + 1, r, B);
        }
        return -1;
    }

    public static int search(final List<Integer> A, int B){
        return pivotBinarySearch(A, B);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }

        System.out.println(search(A, B));

        sc.close();
    }
}
