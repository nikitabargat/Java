import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicatesII {
    static int removeDuplicates(ArrayList<Integer> A) {

        int i = 0, j = 0, count = 0, temp;

        while(j < A.size()) {
            temp = A.get(j);
            count = 0;

            while(j < A.size() && A.get(j) == temp) {
                j++;
                count++;
            }

            for(int k = 0; k < Math.min(count, 2); k++)
                A.set(i++, temp);
        }

        return i;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }

        System.out.println(removeDuplicates(A));

        sc.close();
    }
}
