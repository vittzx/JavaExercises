// problem: https://leetcode.com/problems/remove-element/description/
public class RemoveElement2 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = nums.length - 1;
        for (int i = 0; i <=j ; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                i--;
                count++;
            }
        }
        return nums.length - count;
    }
}

