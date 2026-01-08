
class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE, maxp = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else{
                int p = prices[i]-min;
                maxp=Math.max(p,maxp);
            }
        }
        return maxp;

    

    }
}
