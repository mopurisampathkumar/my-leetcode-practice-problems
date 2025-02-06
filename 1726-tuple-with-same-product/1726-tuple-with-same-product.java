import java.util.*;

class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int product = nums[i]*nums[j];
                frequency.put( product, frequency.getOrDefault(product,0)+1);
            }
        }

        int result = 0;

        for(int value: frequency.values()){
            if(value > 1){
                result += value * (value - 1)*4;
            }
        }
        return result;
    }

}