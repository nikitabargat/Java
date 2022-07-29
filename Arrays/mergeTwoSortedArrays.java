import java.util.ArrayList;
import java.util.Scanner;

public class mergeTwoSortedArrays {

    static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> res = new ArrayList<>();

        int l = 0, r = 0;

        while(l < a.size() &&  r < b.size()) {
            if(a.get(l) < b.get(r)) {
                res.add(a.get(l++));
            } else {
                res.add(b.get(r++));
            }
        }

        while(l < a.size()) res.add(a.get(l++));

        while(r < b.size()) res.add(b.get(r++));

        // a.clear();

        for(int i = 0; i< res.size(); i++) 
            // a.add(res.get(i));
            System.out.print(res.get(i)+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i<n; i++){
            a.add(sc.nextInt());
        }
        int m = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i<m; i++){
            b.add(sc.nextInt());
        }

        merge(a, b);

        sc.close();
    }
}
