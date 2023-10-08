class Jump {
    public boolean canJump(int[] nums) {
        for(int i =0; i < nums.length;){
            for(int j = nums[i]; j >=0; j--){
                if(nums[nums[j]] != 0){
                    i += nums[j];
                    break;
                }
            }
            if(i  >= nums.length){
                return true;
            }
        }
        return false;
    }
}