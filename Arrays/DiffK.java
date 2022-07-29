import java.util.ArrayList;
import java.util.Scanner;

public class DiffK {

    static int doesExists(ArrayList<Integer> A, int B) {

        int i = 0, j = 1;

        while(i <A.size() && j < A.size()) {
            if(i != j && A.get(j) - A.get(i) == B) return 1;
            
            if(A.get(j) - A.get(i) < B) j++;
            
            else i++;
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());   
        }
        int B = sc.nextInt();

        System.out.println(doesExists(A, B));

        sc.close();
    }
}
