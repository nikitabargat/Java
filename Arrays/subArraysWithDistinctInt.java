import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class subArraysWithDistinctInt {

    static int subArrays(ArrayList<Integer> A, int B) {
        int count = 0;

        int l = 0, r = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while(r < A.size()) {
            map.put(A.get(r), map.getOrDefault(A.get(r), 0) + 1);

            while(map.size() > B) {
                map.put(A.get(l), map.get(A.get(l)) - 1);

                if(map.get(A.get(l)) == 0) {
                    map.remove(A.get(l));
                }
                l++;
            }

            count +=(r-l+1);
            r++;
        }

        return count;
    }

    static int solve(ArrayList<Integer> A, int B) {
        return subArrays(A, B) - subArrays(A, B-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());   
        }
        int B = sc.nextInt();

        System.out.println(solve(A, B));

        sc.close();
    }
}
