class Solution {
    public int[] searchRange(int[] nums, int target) {
           int first=search(nums,target,true);
           int last=search(nums,target,false);
           return new int[]{first,last};
    }
        

       public int search(int[]nums ,int target,boolean findfirst){
        int n=nums.length;
         int left=0;
         int right=n-1;

          int ans=-1;
        while(right>=left){
            int mid=left+(right-left)/2;
            
            if(nums[mid]==target){
                ans=mid;
            
             if(findfirst){
               right=mid-1;
            }
            else{
                left=mid+1;
            }

            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }


         return ans; 
        
    }
}