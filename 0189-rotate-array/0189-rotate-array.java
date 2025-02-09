class Solution {
    public void reverseArray(int[] nums,int start,int end){
        int temp;
        while(start < end){
            temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
    public void rotate(int[] nums, int k) {
       
        k %= nums.length;
        reverseArray(nums,0,nums.length - 1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length - 1);
    }
}