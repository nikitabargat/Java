import java.util.Scanner;

public class kadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // input array
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // kadanes algo
        int maxSofar = Integer.MIN_VALUE, maxEndhere = 0;
        for(int i = 0; i<n; i++){
            maxEndhere += arr[i];

            if(maxSofar < maxEndhere) maxSofar = maxEndhere;

            if(maxEndhere < 0) maxEndhere = 0;
        }

        System.out.println(maxSofar);
        sc.close();
    }
}
