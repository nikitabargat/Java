import java.util.ArrayList;
import java.util.Scanner;

public class removeElementFromArray {
    static int removeElement(ArrayList<Integer> A, int B) {
    
        int j = 0;
        for(int i = 0; i< A.size(); i++) {
            if(!A.get(i).equals(B)) {
                A.set(j++, A.get(i));
            }
        }

        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();

        System.out.println(removeElement(A, B));

        sc.close();
    }
}
