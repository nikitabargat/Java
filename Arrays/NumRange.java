import java.util.ArrayList;
import java.util.Scanner;

public class NumRange {

    static int numRange(ArrayList<Integer> A, int B, int C){
        int count = 0;
		if(A.isEmpty()) {
		    return count;
		}
		for(int i=0; i< A.size(); i++){
			int sum =0;
			for(int j = i ; j < A.size(); j++) {
				sum = sum + A.get(j);
				if(sum >= B && sum <=C){
					count++;
				}
				if(sum > C) {
					break;
				}
			}
		}
		return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();
        int C = sc.nextInt();

        numRange(A, B, C);

        sc.close();
    }
}
