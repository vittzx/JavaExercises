
// problem: https://leetcode.com/problems/remove-element/description/

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int right = nums.length - 1;
        int count =0;
        int index = 0;
        while (index <= right) {
            if (nums[index] == val) {
                int temp = nums[index];
                nums[index] = nums[right];
                nums[right] = temp;
                right--;
            }else{
                index++;
                count++;
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,4,2,6,7};
        System.out.println(removeElement(nums, 2));

        int[] nums1 = {4,5,6,7,6,6,9};
        System.out.println(removeElement(nums1, 6));

        int[] nums2 = {1,1,4,5,6,8,88,8,9,120,1};
        System.out.println(removeElement(nums2, 1));


    }
}
