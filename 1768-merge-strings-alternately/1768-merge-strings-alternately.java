class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String result = "";
        int i=0,j=0;
        while(i < word1.length() && j < word2.length()){
            result +=(word1.charAt(i++)+"");
            result +=(word2.charAt(j++)+"");
        }
        if(i == word1.length()){
            while(j < word2.length()){
                result +=(word2.charAt(j++)+"");
            }
        }
        else{
            while(i < word1.length()){
                result +=(word1.charAt(i++)+"");
            }
        }
        return result;
    }
}