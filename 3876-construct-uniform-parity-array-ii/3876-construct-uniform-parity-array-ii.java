class Solution {
    public boolean uniformArray(int[] nums1) {
           
            
            
        
           int minodd = Integer.MAX_VALUE;

     for(int x : nums1) {
       if(x % 2 != 0) {
        minodd = Math.min(minodd, x);
       }
        } 

        if(minodd==Integer.MAX_VALUE){
            return true;
        }

        for(int i: nums1){
                if(i%2==0){
                    if(i-minodd<1){
                        return false;
                    }
                }
        }     
          return true;  
        
    }
}