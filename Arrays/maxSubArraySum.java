import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class maxSubArraySum{

    public static long maximumSum(List<Long> a, long m) {

        long[] s = new long[a.size()];
        TreeSet<Long> tree = new TreeSet<>();

        s[0] = a.get(0) % m;
        tree.add(s[0]);

        long result = s[0];

        for(int i = 1; i<a.size(); i++){
            s[i] = (s[i - 1] + a.get(i)) % m;
            
            Long v = tree.higher(s[i]);

            if(v == null)
                result = Math.max(s[i], result);
            else
                result = Math.max((s[i] - v + m) % m, result);
            
            tree.add(s[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for(int i = 0; i<n; i++){
            a.add(sc.nextLong());
        }
        long m = sc.nextLong();

        System.out.println(maximumSum(a, m));

        sc.close();
    }
}