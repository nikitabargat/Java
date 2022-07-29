import java.util.ArrayList;
import java.util.Scanner;

public class containerWithMostWater {

    static int solve(ArrayList<Integer> A) {
        
        int i = 0, j = A.size()-1;

        int area = 0, min, base; 

        while(i < A.size() && j >= 0) {
            min = Math.min(A.get(i), A.get(j));
            base = j-i;

            area = Math.max(area, min * base);

            if(A.get(i) > A.get(j)) j--;
            else i++;
        }

        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());   
        }

        System.out.println(solve(A));

        sc.close();
    }
}
