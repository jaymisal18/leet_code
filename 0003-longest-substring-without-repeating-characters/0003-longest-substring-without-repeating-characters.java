class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet <Character> set=new HashSet <>();
       int ans=0;
        int i=0;
        int j=0;
        int n=s.length();
         while(j<n){
         if( !set.contains(s.charAt(j) ) ){
              set.add(s.charAt(j));
              
              j++;

         }else{
            set.remove(s.charAt(i));
         
            i++;
         }
            ans=Math.max(ans,set.size());
         
         }

         return ans;
    }
}