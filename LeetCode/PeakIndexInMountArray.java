package broCode.LeetCode;
// problem:  https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
public class PeakIndexInMountArray {
        public static int peakIndexInMountainArray(int[] arr) {
            int aws = 0;
            int aux = -9999999;
            for(int i=0; i< arr.length; i++){
                if(arr[i] > aux){
                    aux = arr[i];
                    aws = i;
                }
            }
            return aws;
        }
    
}
