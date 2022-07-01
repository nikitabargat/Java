import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class plusMinus {

    static void solve(List<Integer> arr){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            arr.add(sc.nextInt());
        }

        sc.close();
    }
}
