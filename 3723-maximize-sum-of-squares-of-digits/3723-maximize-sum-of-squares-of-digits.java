class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder ();
        
        if(sum>num*9){
            return "";
        }
        for(int i=0;i<num;i++){
            int digit=Math.min(9,sum);
            sb.append((char)('0'+digit));
            sum-=digit;
        }
        return sb.toString();
    }
}