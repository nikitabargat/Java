import java.util.ArrayList;
import java.util.Scanner;

public class maxOnesAfterModification {

    static int subsegments(ArrayList<Integer> A, int B) {
        int count = 0;

        int j = 0, max = 0;

        for(int i = 0; i< A.size(); i++) {
            if(A.get(i) == 0) 
                count++;
            while(count > B) {
                if(A.get(j) == 0) count--;
                j++;
            }

            max = Math.max(max, i-j+1);
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());   
        }
        int B = sc.nextInt();

        System.out.println(subsegments(A, B));

        sc.close();
    }
}
