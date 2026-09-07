class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
   // List <Integer> list=new ArrayList<>();
      int n=nums.length;
      int count =0;
      int i=0;
      int max=0;
    while(i<n){
        if(nums[i]==1){
            count++;
           max=Math.max(max,count);
            
        }
        else{
           
            count=0;
        }
        i++;
    }
      return max;
    }
}