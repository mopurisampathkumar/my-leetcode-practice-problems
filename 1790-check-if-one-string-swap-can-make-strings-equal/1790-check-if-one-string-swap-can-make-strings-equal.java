class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
     int[] diff = new int[2];
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count >= 2) {
                    return false;
                }
                diff[count++] = i;
            }
        }

        if (count == 0) {
            return true;
        } else if (count == 2) {
            int i = diff[0];
            int j = diff[1];
            return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
        } else {
            return false;
        }   
    }
}