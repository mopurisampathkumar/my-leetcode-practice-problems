class Solution {
    public char isvalidChar(char c){
        if(c >= 'A' && c <= 'Z'){
            return (char)(c+32);
        }
        else if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
            return c;
        }
        else{
            return ' ';
        }

    }
    public boolean isPalindrome(String s) {
        int start= 0,end = s.length() - 1;
        while(start <= end){
            char s1=isvalidChar(s.charAt(start));
            if(s1 == ' '){
                start++;
                continue;
            }

            char s2=isvalidChar(s.charAt(end));
            if(s2 == ' '){
                end--;
                continue;
            }


            if(s1 == s2){
                
                start++;
                end--;
            }
            else return false;
           
        
            


        }
        if(start > end) return true;
        else return false;
        
    }
}