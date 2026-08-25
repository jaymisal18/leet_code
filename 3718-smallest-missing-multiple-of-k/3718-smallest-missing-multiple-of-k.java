class Solution {
    public int missingMultiple(int[] nums, int k) {
        ;
     int mul=k;
     Arrays.sort(nums);

     
     for(int i=0;i<nums.length;i++){

          if(nums[i]==mul){
                mul+=k;
          }
        

          }
        return mul;

    }
}