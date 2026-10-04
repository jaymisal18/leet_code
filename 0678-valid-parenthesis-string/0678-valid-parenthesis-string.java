class Solution {
    public boolean checkValidString(String s) {
        int degree=0;
        int valid=0;
        int n=s.length();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                degree++;
                 valid++;

            }                                                             
            else if(ch==')'){
                degree--;
                valid--;
            }
            else{
                degree++;
                valid--;
            }
            if(degree<0){
                return false;
            }
            if(valid<0){
                valid=0;
            }
        }
        return valid==0;
    }
}