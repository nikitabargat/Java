import java.util.ArrayList;
import java.util.Scanner;

public class Inversions {

    static int merge(ArrayList<Integer> A, int s, int m, int e){
        int i = s, j = m+1, k = 0;

        int count = 0;

        int[] B = new int[e-s+1];

        while(i < m && j <= e){
            if(A.get(i) <= A.get(j)){
                B[k++] = A.get(i++);
            } else {
                B[k++] = A.get(j++);
                count += (m - i);
            }
        }

        while(i <= m){
            B[k++] = A.get(i++);
        }
        while (j <= e){
            B[k++] = A.get(j++);
        }

        for(i = s, k = 0; i <= e; i++, k++){
            A.set(i, B[k]);
        }

        return count;
    }

    static int mergeSort(ArrayList<Integer> A, int s, int e){

        int count = 0;

        while(s < e){
            int m = s + (e-s)/2;

            count += mergeSort(A, s, m);
            count += mergeSort(A, m+1, e);
            count += merge(A, s, m, e);
        }

        return count;
    }

    static int countInversions(ArrayList<Integer> A){
        return mergeSort(A, 0, A.size()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }

       System.out.println(countInversions(A));

        sc.close();
    }
}
