class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
       int i=0;
       int j=0;
       int x=n-1;
       while(i<=x && j<=x){
          
          if(nums[i]==0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j++;
          }
          else if(nums[i]==2){
            int temp=nums[i];
            nums[i]=nums[x];
            nums[x]=temp;
            x--;
          }
          else{
            i++;
          }
       }

    }
}