import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

class Interval{
    int start, end;

    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}

class overlappingIntervals {

    /* Using stack --- */
    /* TC - O(n*log(n))      SC - O(n)*/
    static void mergeIntervals1(Interval arr[]){
        if(arr.length == 0) return;

        Stack<Interval> stk = new Stack<>();

        Arrays.sort(arr, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });

        stk.push(arr[0]);

        for(int i =0;i <arr.length; i++){
            Interval top = stk.peek();

            if(top.end < arr[i].start)
                stk.push(arr[i]);

            else if (top.end < arr[i].end){
                top.end = arr[i].end;
                stk.pop();
                stk.push(top);
            }
        }

        System.out.println("The merged interval are :");
        while(!stk.isEmpty()){
            Interval it = stk.pop();
            System.out.print("[" + it.start +", "+ it.end + "] ");
        }
    }

    static void mergeIntervals2(Interval arr[]){

        Arrays.sort(arr, new Comparator<Interval>() {
            public int compare(Interval it1, Interval it2){
                return it1.start - it2.start;
            }
        });

        int index = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[index].end >= arr[i].start){
                arr[index].end = Math.max(arr[index].end, arr[i].end);
            } else {
                index++;
                arr[index] = arr[i];
            }
        }

        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++) {
            System.out.print("[" + arr[i].start + "," + arr[i].end + "] "); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Interval[] arr = new Interval[n];

        for(int i = 0; i<n ; i++){
            arr[i] = new Interval(sc.nextInt(), sc.nextInt());
        }

        // mergeIntervals1(arr);

        mergeIntervals2(arr);

        sc.close();
    }
}
    
