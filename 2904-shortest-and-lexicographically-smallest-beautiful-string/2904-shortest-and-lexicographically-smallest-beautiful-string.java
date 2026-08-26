class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans="";
        int count=0;
        int left=0;

        for(int i=0;i<s.length();i++){

           if(s.charAt(i)=='1'){
            count++;
           }

            if(count==k){

                while(s.charAt(left)=='0'){
                    left++;
                }

                String curr=s.substring(left,i+1);

                if( ans.equals("") || curr.length()<ans.length()|| (curr.length()==ans.length() &&curr.compareTo(ans)<0) ){
                   ans=curr;

            }
            count--;
            left++;

        }
        }

          return ans;
    }
}