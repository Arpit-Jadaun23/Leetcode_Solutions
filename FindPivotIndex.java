class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        int leftSum = 0;
        for(int i=0; i<nums.length; i++){
            rightSum += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            rightSum = rightSum - nums[i];
            if(i==0){
                leftSum = 0;
            } else {
                leftSum = leftSum + nums[i-1];
            }
            
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}