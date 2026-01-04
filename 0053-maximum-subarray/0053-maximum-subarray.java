class Solution {
    public int maxSubArray(int[] nums) {
        // int curr = nums[0],maxsum = nums[0];
        // for(int i =1;i < nums.length;i++){
        //     curr= Math.max(nums[i],curr+nums[i]);
        //     maxsum = Math.max(curr,maxsum);
        // }
        // return maxsum;

       int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i  =0;i<n;i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;


    }
}