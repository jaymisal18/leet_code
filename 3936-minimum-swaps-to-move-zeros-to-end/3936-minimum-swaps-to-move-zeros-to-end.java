class Solution {
    public int minimumSwaps(int[] nums) {

        int n = nums.length;
        int output = 0;
        int j = n - 1;

        for(int i=0;i<j;i++){

            if(nums[i]==0){
            while(j>i &&nums[j]==0 ){
                j--;
            }

            if(j>i){
             int temp=nums[i];
             nums[i]=nums[j];
             nums[j]=temp;
             j--;
             output++;
            }
        }
        }

        return output;
    }
}