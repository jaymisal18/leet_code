class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int j=0;
        int sum=0;
        double avg =Integer.MIN_VALUE;;

        for(int i=0;i<nums.length;i++){
          sum+=nums[i];


        if(i-j+1>k){
            sum-=nums[j];
            j++;

        }
        if(i-j+1==k){
            avg=Math.max(avg,(double) sum/k);
        }
            
          
        }
      
      return avg;
    }
}