class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        
        int [] num=new int [n+m];

       int  total =n+m;
    
        for(int i=0;i<n;i++){
            num[i]=nums1[i];
            
        }
        for(int i=0;i<m;i++){
            num[i+n]=nums2[i];
    
        }
        Arrays.sort(num);
        if(total%2==1){
          return num[total/2];
        }
        else {
            int mid1=num[total/2];
            int mid2=num[total/2-1];

            return (mid1+mid2)/2.0;
        }
        
        
    }
}