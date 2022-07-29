import java.util.ArrayList;
import java.util.Scanner;

public class CountingSubarrays {

    static int subarrays(ArrayList<Integer> A, int B) {

        int count = 0, l =0, r = 0, sum = A.get(0);

        while(l < A.size() && r < A.size()) {
            if(sum < B) {
                r++;

                if(r >= l)
                    count += (r-l);
                
                sum += A.get(r);
            } else {
                sum -= A.get(l);
                l++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());   
        }
        int B = sc.nextInt();

        System.out.println(subarrays(A, B));

        sc.close();
    }
}
