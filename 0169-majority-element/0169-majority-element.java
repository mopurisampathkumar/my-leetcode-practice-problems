class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
               freq.put(nums[i],1); 
            }
        }
        int maxkey = Integer.MIN_VALUE;
        int maxvalue = Integer.MIN_VALUE;
        for(int key:freq.keySet()){
            if(maxvalue < freq.get(key)){
                maxvalue = freq.get(key);
                maxkey = key;
            }
        }
        return maxkey;


        
    }
}