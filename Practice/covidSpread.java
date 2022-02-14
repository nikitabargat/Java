import java.util.Scanner;

class covidSpread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T --> 0){
            int N = sc.nextInt();
            int D = sc.nextInt();

            // no. of infected people
            int ans = 1;

            for(int i = 1; i<=D; i++){

                if(i<=10) ans *= 2;

                else ans *= 3;

                if (ans >= N) {
                    ans = N;
                    break;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}