import java.util.Scanner;

public class uglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n+1];

        arr[0] = 1;

        int count2 = 0, count3 = 0, count5 = 0;
        int multiple2 = 2, multiple3 = 3, multiple5 = 5 ;

        for(int i = 1; i<=n; i++){
            arr[i] = Math.min(Math.min(multiple2, multiple3), multiple5);

            if(arr[i] == multiple2){
                count2++;
                multiple2= arr[count2] * 2;
            }
            if(arr[i] == multiple3){
                count3++;
                multiple3= arr[count3] * 3;
            }
            if(arr[i] == multiple5){
                count5++;
                multiple5= arr[count5] * 5;
            }
        }
        
        System.out.println(arr[n-1]);
        sc.close();
    }
}
