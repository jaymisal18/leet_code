class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    List <Integer> list=new ArrayList<>();
      int n=nums.length;
      int count =0;
    for(int i=0;i<n;i++){
        if(nums[i]==1){
            count++;
            if( i==n-1){
                list.add(count);
            }
            
        }
        else{
            list.add(count);
            count=0;
        }
    }
    return Collections.max(list);

    }
}