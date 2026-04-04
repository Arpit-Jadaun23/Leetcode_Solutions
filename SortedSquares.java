class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length-1;
        int pos = nums.length-1;
        int ans[] = new int[nums.length];

        while(i <= j){
            int ls = nums[i] * nums[i];
            int rs = nums[j] * nums[j];

            if(ls > rs){
                ans[pos] = ls;
                i++;
            } else {
                ans[pos] = rs;
                j--;
            }

            pos--;
        }

        return ans;
    }
}