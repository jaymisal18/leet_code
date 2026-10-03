class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        boolean ans=false;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                ans=true;
            }
            map.put(nums[i],i);
        }

        return ans;
    }
}