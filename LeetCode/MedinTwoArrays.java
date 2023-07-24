package broCode.LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/median-of-two-sorted-arrays/

public class MedinTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] nums3 = new int[nums1.length + nums2.length];
        int indexN3 = 0;
        for(int i: nums1){
            nums3[indexN3] = i;
            indexN3++;
        }
        for(int i: nums2){
            nums3[indexN3] = i;
            indexN3++;
        }

        Arrays.sort(nums3);
        if(nums3.length % 2 ==0){
            return (double)(nums3[(int)(nums3.length / 2)] + nums3[(int)(nums3.length / 2) - 1]) /2;
        }else{
            return nums3[(int)(nums3.length / 2)];
        }



    }
}
