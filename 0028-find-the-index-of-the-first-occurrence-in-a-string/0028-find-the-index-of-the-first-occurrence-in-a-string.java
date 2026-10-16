class Solution {
    public int strStr(String haystack, String needle) {
        for (int i=0,j=needle.length()-1;j<haystack.length();i++,j++){
            if(haystack.substring(i,j+1).equals(needle)){
                return i;
            }
       
    }
     return -1;
    }
}