class Solution {
    public int maxAscendingSum(int[] nums) {
        int[] Sum = new int[nums.length];
        int k = 0;
        Sum[k] = nums[0];
        for(int i = 1; i < nums.length ; i++){
            
            if(nums[i] > nums[i - 1]){
                Sum[k]+=nums[i];
            }
            else{
                Sum[++k] += nums[i];
            }

        }
        int minim = Sum[0];
        for(int l = 1 ; l < Sum.length; l++){
            if(Sum[l] > minim)
                minim = Sum[l];
        }
        return minim;
    }
}