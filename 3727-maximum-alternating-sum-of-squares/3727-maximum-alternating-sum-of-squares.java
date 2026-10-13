class Solution {
    public long maxAlternatingSum(int[] nums) {
        long [] arr=new long[nums.length];
        long score=0;
        for(int i=0;i<nums.length;i++){
           arr[i]=nums[i]*nums[i];
        }
          Arrays.sort(arr);
        int k=nums.length/2;
        for(int i=0;i<k;i++){
            score-=arr[i];
        }
        for(int i=k;i<nums.length;i++){
            score+=arr[i];
        }
        return score;
    }
}