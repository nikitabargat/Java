import java.util.ArrayList;
import java.util.Scanner;

public class SortByColor {

    static void swap (ArrayList<Integer> A,int i, int j) {
        int num = A.get(i);
        A.set(i, A.get(j));
        A.set(j, num);
    }

    static void sort(ArrayList<Integer> A) {

        int s = 0, m = 0, e = A.size()-1;

        while(m <= e) {
            switch(A.get(m)) {
                case 0: {
                    swap(A, s, m);
                    s++; m++;
                    break;
                }
                case 1: {
                    m++;
                    break;
                }
                case 2: {
                    swap(A, m, e);
                    e--;
                    break;
                }
            }
        }

        for(int j = 0; j < A.size(); j++) {
            System.out.print(A.get(j)+ " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }
        
        sort(A);

        sc.close();
    }
}
