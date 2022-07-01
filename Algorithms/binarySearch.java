import java.util.Scanner;

public class binarySearch {

    static int RecursiveBSearch(int[] arr,int l, int r, int k){

        if( l <= r){
            int mid = l + (r - l)/2;

            if(arr[mid] == k) return mid;

            if(arr[mid] > k) RecursiveBSearch(arr, l, mid - 1, k);

            return RecursiveBSearch(arr, mid + 1, r, k);
        }
        return -1;
    }

    static int search(int[] arr, int k){

        int l = 0, r = arr.length - 1;
        
        while(l <= r){
            int mid = l + (r - l)/2;

            if(arr[mid] == k) return mid;

            if(arr[mid] < k)  l = mid + 1;

            else return  r = mid - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Iterative Method ---
        System.out.println(search(arr, k));

        // Recursive Method ---
        System.out.println(RecursiveBSearch(arr, 0, n - 1, k));
        
        sc.close();
    }
}
