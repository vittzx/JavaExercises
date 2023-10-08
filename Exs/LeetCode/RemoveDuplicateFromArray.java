

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicateFromArray {
    public static int removeDuplicates(int[] nums){
        // int k = 0; // the answer variable 
        // int j =0; // variable i auxiliary

        // int[] expectedNums = new int[nums.length]; // the array with the numbers without duplicate


        // for(int i =1 ; i < nums.length; i++){
        //     if(nums[i] != nums[i-1]){
        //         expectedNums[k] = nums[j];
        //         k++;
        //     }
        //     j++;
        //     if(i == nums.length -1 && nums[j] != expectedNums[k]){
        //         expectedNums[k] = nums[i];
        //     }
        // }
        // nums = expectedNums;
        
        // System.out.println(Arrays.toString(nums));
        // return k;

        if (nums.length == 0) {
            return 0;
        }
    
        int k = 1; // Index for the next unique element
    
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
    
        return k;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums)); // expected 4 == 4 |
        int[] num = {1,1,2};
        System.out.println(removeDuplicates(num));
    }
}
