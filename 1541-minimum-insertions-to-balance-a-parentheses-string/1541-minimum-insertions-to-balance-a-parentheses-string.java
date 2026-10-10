class Solution {
    public int minInsertions(String s) {
       
        int count=0;
        int depth=0;
        int i=0;
        int n=s.length();
       while(i<n){
                if(s.charAt(i)=='('){
                    depth++;
                    i++;
                }
                else{

                    if(i+1<s.length() &&  s.charAt(i+1)==')'){
                        i+=2;
                    }
                    else{
                        count++;
                        i++;
                    }

                    if(depth==0){
                        count++;
                    }
                    else{
                        depth--;
                    }
                }
           
        }
        count +=depth *2;
        return count ;
    }
}