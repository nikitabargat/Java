import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class searchForRange {
    static ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();

        int l = 0, h = A.size(), mid;
        int start = -1, end = -1;

        while(l < h){
            mid = (l + h)/2;
            if(A.get(mid) >= B) h = mid;
            else l = mid++;
        }

        if(h >= A.size() || A.get(h) != B) {
            res.add(-1);
            res.add(-1);
        }
        start = h;

        while(l < h){
            mid = (l + h)/2;
            if(A.get(mid) <= B) l = mid++;
            else h = mid;
        }
        end = l - 1;

        res.add(start);
        res.add(end);

        return res;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }

        System.out.println(searchRange(A, B));

        sc.close();
    }
}
