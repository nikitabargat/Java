import java.util.Scanner;

public class bitBlend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();

            // int m = sc.nextInt();
            // int v = sc.nextInt();

            // System.out.println(n ^ m ^ v);
            
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int count = 0;

            for(int i = 0; i<n-1; i++){
                if((arr[i] ^ arr[i+1]) % 2 == 0){
                    count++;
                }
                int[][] indices = new int[count][2];
            }
            
        }

        sc.close();

    }
}
