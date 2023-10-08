

// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] nums, int target){
        int[] aws = new int[2]; 
        for(int i =0; i< nums.length ; i++){
            for(int j = i+1 ; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                aws[0] = i;
                aws[1] = j;
                break;
            }
        }


        }
        return aws;
    }
}
