class Solution {
    public String multiply(String num1, String num2) {
        int []res=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            int digit1=num1.charAt(i)-'0';

            for(int j=num2.length()-1;j>=0;j--){
                int digit2=num2.charAt(j)-'0';
                int mul=digit1*digit2;
                int p1=i+j;
                int p2=i+j+1;

                int sum=mul+res[p2];
                res[p1]+=sum/10;
                res[p2]=sum%10;
            }
        }
        StringBuilder sb=new StringBuilder();
         for(int nums:res){
        if(! (sb.length()==0 &&nums==0)){
            sb.append(nums);
        }
         }
          if(sb.length()==0){
            return "0";
          }
          return sb.toString();
        
    }
}