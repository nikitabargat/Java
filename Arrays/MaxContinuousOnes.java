import java.util.ArrayList;
import java.util.Scanner;

public class MaxContinuousOnes {

    //Approach -1 --> O(n^2)
    static ArrayList<Integer> MaxOnes1(ArrayList<Integer> A, int B) {
        int count ;

        ArrayList<Integer> res = new ArrayList<>();

        int l = 0, r = 0;

        for(int i = 0; i < A.size(); i++) {
            count = B;
            for(int j = i;j < A.size(); j++) {
                if(A.get(j) == 0) count--;

                if(count < 0) break;

                if(r - l < j- i) {
                    l = i;
                    r = j;
                }
            }
        }

        for(int k = l; k<=r; k++)
            res.add(k);

        return res;
    }


    //Approach -2 --> O(n) (Optimal)
    static ArrayList<Integer> MaxOnes2(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();

        int l = 0, r = 0;

        int i =0, j = 0;

        while(j < A.size() ) {
            if(A.get(j) == 0) B--;

            while(B < 0) {
                if(A.get(i) == 0) B++;
                i++;
            }

            if(r - l < j- i) {
                l = i;
                r = j;
            }
            j++;
        }

        for(int k = l; k<=r; k++)
            res.add(k);

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());   
        }
        int B = sc.nextInt();

        System.out.println(MaxOnes1(A, B));
        System.out.println(MaxOnes2(A, B));

        sc.close();
    }
}
