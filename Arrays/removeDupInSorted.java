import java.util.Scanner;

public class removeDupInSorted {

    static int removeDuplicates(int[] nums){

        if(nums.length == 0 || nums.length == 1) return nums.length;

        int j = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] != nums[i+1])
                nums[j++] = nums[i];
        }

        nums[j++] = nums[nums.length - 1];

        
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(removeDuplicates(nums));

        sc.close();
    }
}
