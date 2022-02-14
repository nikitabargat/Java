import java.util.Arrays;
import java.util.Scanner;

public class countingSort {

    static int max(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static void sort(int[] arr){
        int[] countArr = new int[max(arr)+1];
        Arrays.fill(countArr, 0);

        for(int i = 0; i<arr.length; i++){
            countArr[arr[i]]++;
        }

        for(int i = 1; i<countArr.length; i++){
            countArr[i] += countArr[i-1];
        }

        int[] newArr= new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            newArr[countArr[arr[i]] - 1] = arr[i];
        }

        for(int i = 0; i<newArr.length ;i++){
            System.out.print(newArr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);

        sc.close();
    }
}
