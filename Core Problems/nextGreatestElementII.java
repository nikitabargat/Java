import java.util.Scanner;
import java.util.Stack;

class nextGreatestElementII {

    /*----------- Brute force approach -------- */
    static void element1(int[] nums){
        int max ;
        for(int i = 0; i<nums.length; i++){
            max = -1;
             for(int j = i+1 ; j < nums.length + i; j++){
                if(nums[i] < nums[j % nums.length]){
                    max = nums[j % nums.length];
                    break;
                }
             }
             System.out.print(max + " ");
         }
    }


    /* ---------- Using Stack ----------- */
    static void element2(int[] nums){

        Stack<Integer> stk = new Stack<>();

        int[] result = new int[nums.length];

        for(int i = 2*nums.length - 1; i>= 0; i--){

            while(!stk.isEmpty() && nums[i % nums.length] >= stk.peek())
                stk.pop();

            if(i < nums.length){
                if(!stk.isEmpty())
                    result[i] = stk.peek();
                else
                    result[i] = -1;
            }
            stk.push(nums[i % nums.length]);
        }

        for(int i : result)
            System.out.print(i + " ");
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
