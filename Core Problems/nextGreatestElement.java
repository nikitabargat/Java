import java.util.Scanner;
import java.util.Stack;

class nextGreatestElement {

    /*------------ Brute force approach -------------- */
    /* O(n^2) */
    static void element1 (int[] nums){

        for(int i = 0; i<nums.length; i++){
           int max = -1;
            for(int j = i+1 ; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    max = nums[j];
                    break;
                }
            }
            System.out.print(max + " ");
        }
    }

    /*------------- Using Stack ------------------- */
    /* O(n) */
    static void element2(int[] nums){

        Stack<Integer> stk = new Stack<>();
        stk.push(nums[0]);

        int next, element;

        for(int i = 1; i<nums.length; i++){
            next = nums[i];

            if(!(stk.isEmpty())){
                element = stk.pop();

                while(element < next ){
                    System.out.print(next + " ");

                    if(stk.isEmpty()) break;

                    element = stk.pop();
                }

                if(element > next) stk.push(element);
            }

            stk.push(next);
        }

        while(!(stk.isEmpty())){
            element = stk.pop();
            next = -1;
            System.out.print(next);
        }
    }

    /* ----------------- Using Stack method->2 ----------- */
    static void element3(int[] nums){
        Stack<Integer> stk = new Stack<>();

        int[] result = new int[nums.length];

        for(int i = nums.length - 1; i>= 0; i--){

            if(!(stk.isEmpty())){

                while(!(stk.isEmpty()) && stk.peek() <= nums[i])
                    stk.pop();
            }

            result[i] = stk.isEmpty() ? -1 : stk.peek();

            stk.push(nums[i]);
        }

        for (int i = 0; i < nums.length; i++)
            System.out.print(result[i]);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        // element1(nums);

        element2(nums);

        sc.close();
    }
}
