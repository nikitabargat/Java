
import java.util.Scanner;

public class DistinctSubsequences {

    static int subsequences(String A, String B){

        int rows = A.length(), cols = B.length();

        int temp[][] = new int[rows + 1][cols + 1];

        // If first string is empty
        for(int i = 0; i<= cols; i++){
            temp[0][i]= 0;
        }

        // If second string is empty
        for(int i = 0; i<= rows; i++){
            temp[i][0]= 1;
        }

        // fill temp[][] bootom-up manner
        for(int i = 1; i<= rows; i++){
            for(int j = 1; j<= cols; j++){
                if(A.charAt(i-1) == B.charAt(j-1)){
                    temp[i][j] = temp[i-1][j-1] + temp[i-1][j];
                }else{
                    temp[i][j] = temp[i-1][j];
                }
            }
        } 

        return temp[rows][cols];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(subsequences(a, b));

        sc.close();
    }
}
